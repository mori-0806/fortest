package demo;
/*
��̬��ʼ����ָ�����ݣ�;
�ڴ��������ʱ�򣬲�ֱ��ָ�����ݸ������٣�����ֱ�ӽ�������������ݽ���ָ����

��̬��ʼ��ʡ�Ը�ʽ��
  ʡ�Ը�ʽ��
     ��������[] �������� = { Ԫ��1, Ԫ��2, ... };

*/
public class ArrayStaticS {
	  public static void main(String[] args) {
	        // �þ�̬��ʼ����׼��ʽ
		  // ����һ�����飬����װ�ַ����� "���"��"hello"��"����ˤ���"
	        String[] array = { "���", "hello", "����ˤ���" };
	 
	        //�ֱ��ӡ����array��Ԫ��
	        System.out.println(array[0]); //���
	        System.out.println(array[1]); // hello
	        System.out.println(array[2]); // ����ˤ���
	        
	        System.out.println("--------------------------");
	 
	      //������ӡ�������е�����Ԫ��
	        for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
	    }
	

}
