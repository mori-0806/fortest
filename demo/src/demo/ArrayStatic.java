package demo;
/*
 ��̬��ʼ����ָ�����ݣ�;
 �ڴ��������ʱ�򣬲�ֱ��ָ�����ݸ������٣�����ֱ�ӽ�������������ݽ���ָ����

��̬��ʼ��������ʽ��
   ��׼��ʽ��
       ��������[] �������� = new ��������[] { Ԫ��1, Ԫ��2, ... };

*/
public class ArrayStatic {
	public static void main(String[] args) {
        // �þ�̬��ʼ����׼��ʽ
		// ֱ�Ӵ���һ�����飬����װ��ȫ����int���֣�����Ϊ��5��15��25��40
        int[] arrayA = new int[] { 5, 15, 25, 40 };
 
        // ����һ�����飬����װ�ַ�����"Hello"��"World"��"Java"
        String[] arrayB = new String[] { "Hello", "World", "Java" };
        
        //�ֱ��ӡ����arrayA��arrayB��Ԫ��
		  System.out.println(arrayA[0]);//5
		  System.out.println(arrayA[1]);//15
		  System.out.println(arrayA[2]);//25
		  System.out.println(arrayA[3]);//40
		  
		  System.out.println(arrayB[0]);//Hello
		  System.out.println(arrayB[1]);//World
		  System.out.println(arrayB[2]);//Java
		  
		  System.out.println("------------------------");
		  
		//������ӡ��arrayA��arrayB��Ԫ��
		  //arrayA
		  for (int i = 0; i < arrayA.length; i++) {
			System.out.println(arrayA[i]);
		}
		//arrayB
		  for (int i = 0; i < arrayB.length; i++) {
				System.out.println(arrayB[i]);
			}
		
	}

}
