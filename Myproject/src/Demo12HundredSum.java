/*��Ŀ�����1-100֮��ż���ĺ͡�
 * 
 * ˼·��
 * 1.��Ȼ��Χ�Ѿ�ȷ������1-100֮�䣬��ô�ʹ�1��2��3��
 * 
 */
public class Demo12HundredSum {
	public static void main (String[] args) {
		int sum=0; //�������ӵĴ�Ǯ��
		
		for (int i=1; i<=100; i++) {
			if (i%2==0) { //�����ż��
				sum +=i; // sum=sum+i
				
			}
			
			
		} 
		System.out.println("����ǣ� "+sum);
		
		System.out.println("=================== ");
		
		//��Ŀ�����1-100֮�������ĺ͡�
		
		
		int b=0;
		
		for (int a=1; a <=100; a++) {
			if (a%2!=0) { //���������
				b+=a;
			}
		}
		System.out.println("result is: "+ b);
		
		System.out.println("=================== ");
		
		int result;
		result= sum+b;
		
		System.out.println("result is: "+ result); // �����������ĺ͡�
		
		System.out.println("=================== ");
		
		//��Ŀ����ӡ1-100֮���ż��
		
		for (int c=1; c<=100; c++) {
			if(c%2==0) {
				System.out.println("��ӡ1-100֮���ż��"+c);
				
			}
					}
		
		
		
		
	}

}
