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
 * <b>API�ѩ`����No.60</b> <br />
 * �F��3�����s�ץ��ȡ��Module
 * 
 * @author tian-cheng
 *
 */
@Component
public class PtNo60GetContractPlanStatusModule extends AbstractSpiralLogicModule<Object[][]> {

  @Autowired
  private ContractMapper contractMapper;

  // �Є��_ʼ�Օr(�m�ìF���_ʼ�r�g)
  private static final LocalDateTime StartDateTime1 = LocalDateTime.parse("1970/01/01 00:00:00",
      DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));

  // �Є��K���Օr(�m�ìF�нK�˕r�g)
  private static final LocalDateTime EndDateTime1 = LocalDateTime.parse("2020/05/07 23:59:59",
      DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));

  // �Є��_ʼ�Օr(�m�����_ʼ�r�g)
  private static final LocalDateTime StartDateTime2 = LocalDateTime.parse("2020/05/08 00:00:00",
      DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));

  // �Є��K���Օr(�m���½K�˕r�g)
  private static final LocalDateTime EndDateTime2 = LocalDateTime.parse("2099/12/31 23:59:59",
      DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
  // ���s����
  private static final int contractMonths = 36;

  @Override
  public String getDescription() {
    return "API�ѩ`����No.60 �F��3�����s�ץ���Select�I��";
  }

  @Override
  public boolean match(SpiralRequestParseResult parseResult) {
    // Entity��column�����ڤ��뤫�ɤ���
    return SpiralTable.CONTRACT.tableName().equals(parseResult.getSpiralTable())
        && parseResult.hasRdbEntityInCondition(Contract.class)
        && parseResult.hasRdbEntityInSelect(Contract.class)
        && parseResult.hasSpiralColumnInCondition("entryNumber")
        && parseResult.hasSpiralColumnInSelect("contractCode", "contractPlan", "creditEntryDate");
  }

  /**
   * select�I��
   */
  @Override
  public Object[][] execute(AccessContext accessContext, SpiralRequestParseResult parseResult) {

    // Validation�����å�
    validationCheck(parseResult);

    ObjectWrap<Contract> wrapContract = ObjectWrap.of(null);
    parseResult.getEntityFromCondition(Contract.class).ifPresent(contract -> {
      Contract contractDto =
          contractMapper.findContractPlanStatus(contract.getContractId(), contractMonths);
      // ���s�ǩ`���O��
      wrapContract.set(contractDto);
    });

    // select�I��Y��
    if (wrapContract.isPresent()) {
      Contract dto = wrapContract.get();
      // ���s�ץ��SV
      int contractPlan = dto.getContractPlanSv();
      // ���s�ץ��Ԕ��SV
      int contractPlanDetail = dto.getContractPlanDetailSv();
      // ���Ō������z�Օr
      LocalDateTime creditEntryTime = dto.getCreditEntryDatetime();

      Object[] data = new Object[1];
      if (contractPlan == ContractPlanSv.one.getSv()
          && contractPlanDetail == ContractPlanDetailSv.OneToyota.getSv()
          && creditEntryTime.isAfter(StartDateTime1) && creditEntryTime.isBefore(EndDateTime1)) {
        // �F�С����ꂎ: �F���s�ץ��
        data[0] = ContractPlanStatusSv.NowContract.getSv();
      } else if (contractPlan == ContractPlanSv.one.getSv()
          && contractPlanDetail == ContractPlanDetailSv.OneToyota.getSv()
          && creditEntryTime.isAfter(StartDateTime2) && creditEntryTime.isBefore(EndDateTime2)) {
        // �¡����ꂎ: �����s�ץ��
        data[0] = ContractPlanStatusSv.NewContract.getSv();
      } else if (contractPlan == ContractPlanSv.one.getSv()
          && contractPlanDetail == ContractPlanDetailSv.OneLexus.getSv()
          && creditEntryTime.isAfter(StartDateTime2) && creditEntryTime.isBefore(EndDateTime2)) {
        // �¡����ꂎ: �����s�ץ��
        data[0] = ContractPlanStatusSv.NewContract.getSv();
      } else {
        // �����⡢���ꂎ�� ������
        data[0] = ContractPlanStatusSv.Excluded.getSv();
      }

      return new Object[][] {data};
    }

    // ���sID�����ڤ��ʤ�����
    return null;
  }

  private void validationCheck(SpiralRequestParseResult parseResult) {
    // errorMsg��å��`����ǥ������
    MsgModel errorMsg = new MsgModel();

    parseResult.getSpiralColumnFromCondition("entryNumber").ifPresentOrElse(spiralColumnModel -> {
      InputCheck.notEmptyText(errorMsg, spiralColumnModel.getColumnValue(),
          spiralColumnModel.getTableColumnName());
    }, addNotFoundColumnMsg(errorMsg, parseResult.getSpiralTable(), "entryNumber"));
    // ��å��`�������ڤ����顢��å��`������k��
    errorMsg.ifH asMsgThrow(() -> new MsgResponseException(errorMsg));
  }

}
