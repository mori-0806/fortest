/* do-whileѭ���ı�׼��ʽ��
 * 
 * do {
 * ѭ����
 * } while (�����ж�);
 * 
 * ��չ��ʽ��
 * ��ʼ����䣻
 * do {
 * ѭ����
 * �������
 * } while(�����ж�);
 * 
 * 
 */
public class Demo11DoWhile {
	public static void main (String[] args) {
		for (int i=1;i <=10; i++) {
		System.out.println ("�Բ����Ҵ��ˣ���ԭ���ң�"+ i);
		}
		System.out.println("==============================");
		
		
		
		
		
		int i=1; //1.��ʼ�����
		int sum=0;
		
		do { 	
			if (i%2==0) {
				sum+=i;
				
			}//3.ѭ����	
			
			i++; //4.�������
			
		} while (i<=100);//2.�����ж�
		System.out.println("ż���ĺ�"+sum); 	
		
	}

}
