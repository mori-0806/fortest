/* ���ֺ��ַ����չ�ϵ�������
 * ASCII�����American Standard Code Information Interchange,������Ϣ������׼���롣
 * Unicode�������룬Ҳ���������ַ��Ķ��չ�ϵ����ͷ-127��ASCII��ȫһ������128��ʼ���������ַ���
 * emoji��
 * 48=0
 * 65=A
   97=a
   */
public class ASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char zifu1='A';
		System.out.println(zifu1+1); //�����66
		
		char zifu2='A';
		System.out.println(zifu2); //��ʵ�ײ�������65
		
		char zifu3='c';
		int num1=zifu3;
		//�����int���ͣ��ұ���char����
		//char-->int�����ϴ�С����Ĺ�����˷������Զ�����ת����
		
		System.out.println(num1); //int�������࣬�����99
		
		char zifu4='��';
		System.out.println(zifu4+0); //�����20013
	

	}

}
