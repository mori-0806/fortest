package com.kinto.web.module.spiral.select;

import com.kinto.constant.SpiralConstant.SpiralTable;
import com.kinto.constant.sv.RdbSv.ContractPlanDetailSv;
import com.kinto.constant.sv.RdbSv.ContractPlanStatusSv;
import com.kinto.constant.sv.RdbSv.ContractPlanSv;
import com.kinto.domain.entity.Contract;
import com.kinto.domain.mapper.ContractMapper;
import com.kinto.utils.ObjectWrap;
import com.kinto.web.core.context.AccessContext;
import com.kinto.web.core.exception.MsgResponseException;
import com.kinto.web.core.exception.message.MsgModel;
import com.kinto.web.core.utils.InputCheck;
import com.kinto.web.model.spiral.SpiralRequestParseResult;
import com.kinto.web.module.spiral.AbstractSpiralLogicModule;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <b>APIパータンNo.60</b> <br />
 * 現新3年契約プラン取得Module
 * 
 * @author tian-cheng
 *
 */
@Component
public class PtNo60GetContractPlanStatusModule extends AbstractSpiralLogicModule<Object[][]> {

  @Autowired
  private ContractMapper contractMapper;

  // 有効開始日時(適用現行開始時間)
  private static final LocalDateTime StartDateTime1 = LocalDateTime.parse("1970/01/01 00:00:00",
      DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));

  // 有効終了日時(適用現行終了時間)
  private static final LocalDateTime EndDateTime1 = LocalDateTime.parse("2020/05/07 23:59:59",
      DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));

  // 有効開始日時(適用新開始時間)
  private static final LocalDateTime StartDateTime2 = LocalDateTime.parse("2020/05/08 00:00:00",
      DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));

  // 有効終了日時(適用新終了時間)
  private static final LocalDateTime EndDateTime2 = LocalDateTime.parse("2099/12/31 23:59:59",
      DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
  // 契約月数
  private static final int contractMonths = 36;

  @Override
  public String getDescription() {
    return "APIパータンNo.60 現新3年契約プランのSelect処理";
  }

  @Override
  public boolean match(SpiralRequestParseResult parseResult) {
    // Entity、columnが存在するかどうか
    return SpiralTable.CONTRACT.tableName().equals(parseResult.getSpiralTable())
        && parseResult.hasRdbEntityInCondition(Contract.class)
        && parseResult.hasRdbEntityInSelect(Contract.class)
        && parseResult.hasSpiralColumnInCondition("entryNumber")
        && parseResult.hasSpiralColumnInSelect("contractCode", "contractPlan", "creditEntryDate");
  }

  /**
   * select処理
   */
  @Override
  public Object[][] execute(AccessContext accessContext, SpiralRequestParseResult parseResult) {

    // Validationチェック
    validationCheck(parseResult);

    ObjectWrap<Contract> wrapContract = ObjectWrap.of(null);
    parseResult.getEntityFromCondition(Contract.class).ifPresent(contract -> {
      Contract contractDto =
          contractMapper.findContractPlanStatus(contract.getContractId(), contractMonths);
      // 契約データ設定
      wrapContract.set(contractDto);
    });

    // select処理結果
    if (wrapContract.isPresent()) {
      Contract dto = wrapContract.get();
      // 契約プランSV
      int contractPlan = dto.getContractPlanSv();
      // 契約プラン詳細SV
      int contractPlanDetail = dto.getContractPlanDetailSv();
      // 与信審査申込日時
      LocalDateTime creditEntryTime = dto.getCreditEntryDatetime();

      Object[] data = new Object[1];
      if (contractPlan == ContractPlanSv.one.getSv()
          && contractPlanDetail == ContractPlanDetailSv.OneToyota.getSv()
          && creditEntryTime.isAfter(StartDateTime1) && creditEntryTime.isBefore(EndDateTime1)) {
        // 現行、戻り値: 現契約プラン
        data[0] = ContractPlanStatusSv.NowContract.getSv();
      } else if (contractPlan == ContractPlanSv.one.getSv()
          && contractPlanDetail == ContractPlanDetailSv.OneToyota.getSv()
          && creditEntryTime.isAfter(StartDateTime2) && creditEntryTime.isBefore(EndDateTime2)) {
        // 新、戻り値: 新契約プラン
        data[0] = ContractPlanStatusSv.NewContract.getSv();
      } else if (contractPlan == ContractPlanSv.one.getSv()
          && contractPlanDetail == ContractPlanDetailSv.OneLexus.getSv()
          && creditEntryTime.isAfter(StartDateTime2) && creditEntryTime.isBefore(EndDateTime2)) {
        // 新、戻り値: 新契約プラン
        data[0] = ContractPlanStatusSv.NewContract.getSv();
      } else {
        // 対象外、戻り値： 対象外
        data[0] = ContractPlanStatusSv.Excluded.getSv();
      }

      return new Object[][] {data};
    }

    // 契約IDが存在しない場合
    return null;
  }

  private void validationCheck(SpiralRequestParseResult parseResult) {
    // errorMsgメッセージモデルを作成
    MsgModel errorMsg = new MsgModel();

    parseResult.getSpiralColumnFromCondition("entryNumber").ifPresentOrElse(spiralColumnModel -> {
      InputCheck.notEmptyText(errorMsg, spiralColumnModel.getColumnValue(),
          spiralColumnModel.getTableColumnName());
    }, addNotFoundColumnMsg(errorMsg, parseResult.getSpiralTable(), "entryNumber"));
    // メッセージが存在したら、メッセージ例外発生
    errorMsg.ifH asMsgThrow(() -> new MsgResponseException(errorMsg));
  }

}
