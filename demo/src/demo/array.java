package demo;
/*
����ĳ�ʼ�������ڴ浱�д���һ�����飬���������и���һЩĬ��ֵ��

1.���ֳ����ĳ�ʼ����ʽ��
 a. ��̬��ʼ����ָ�����ȣ��ڴ��������ʱ��ֱ��ָ�����鵱�е�����Ԫ�ظ�����
 b. ��̬��ʼ����ָ�����ݣ��ڴ��������ʱ�򣬲�ֱ��ָ�����ݸ������٣�����ֱ�ӽ�������������ݽ���ָ����

2.��̬��ʼ������ĸ�ʽ��
        ��������[] �������� = new ��������[���鳤��];

3.��̬��ʼ��������ʽ��
    ��׼��ʽ��
        ��������[] �������� = new ��������[] { Ԫ��1, Ԫ��2, ... };
    ʡ�Ը�ʽ��
       ��������[] �������� = { Ԫ��1, Ԫ��2, ... };

*/
public class array {
	  public static void main(String[] args) {
		  //��̬��ʼ��
		//����һ������arrayA,�����ܴ��5���ַ���  
		  //��ʽ����������[] �������� = new ��������[���鳤��];
		  String[] arrayA = new String[5];
		  
		  //�ֱ��5���ַ�����ֵ
		  arrayA[0]="����arrayA��0��Ԫ��";
		  arrayA[1]="����arrayA��1��Ԫ��";
		  arrayA[2]="����arrayA��2��Ԫ��";
		  arrayA[3]="����arrayA��3��Ԫ��";
		  arrayA[4]="����arrayA��4��Ԫ��";
//		  arrayA[5]="����arrayA��4��Ԫ��";
		  
		  //�ֱ��ӡ�����Ԫ��
		  System.out.println(arrayA[0]);//����arrayA��0��Ԫ��
		  System.out.println(arrayA[1]);//����arrayA��1��Ԫ��
		  System.out.println(arrayA[2]);//����arrayA��2��Ԫ��
		  System.out.println(arrayA[3]);//����arrayA��3��Ԫ��
		  System.out.println(arrayA[4]);//����arrayA��4��Ԫ��
		  
		  System.out.println("----------------------------------");
		  
		  for (String string : arrayA) {
			System.out.println(string);
		}
		  
		  //������ӡ�������е�����Ԫ��
		  //arrayA.length�����������arrayA�ĳ���
//		  for (int i = 0; i < arrayA.length; i++) {
//			System.out.println(arrayA[i]);
//		}
	    }
	}
