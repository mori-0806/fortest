/*
 * switch���ʹ�õ�ע�����
 * 1.���case�������ֵ�������ظ�������������䶼��case1.
 * 
 * 2.switch����С���ŵ��������������������ͣ�
 * �����������ͣ�byte/short/char/int
 * �����������ͣ�String�ַ�����enumö��
 * 
 * 3.switch����ʽ���Ժ���ǰ��˳����Եߵ�������break������ʡ�ԡ�
 * ����case1��2��������default�ĺ��棬˳����Ը�����
 * 
 * 4.������һ������breakʡ�Ե�����£�ƥ����һ��case�ʹ���һ��λ�����������ִ�У�
 * ֱ��������break�����������Ϊֹ��
 * 
 */
public class Demo08Notice {
	
	public static void main(String[] args) {
		
		int num=2;
		
		switch (num) {
		
		case 1:
			System.out.println("���");
			break;
		
		case 2:
			System.out.println("�Һ�");
			//break; ��num=2��ʱ��case2���û��break��
			//���Ի�ִ�е�case3Ϊֹ��
			//���Ϊ���Һã�
			//        ��Һá�
			
		case 3:
			System.out.println("��Һ�");
			break;
			
			
		default:
			System.out.println("���ã���Ҳ��");
			break;
			
			

			
		

		}
		
		
	}

}
