//��Ŀ��ʹ����Ԫ������ͱ�׼��if-else���ֱ�ʵ�֣�ȡ�������ֵ��е����ֵ��

public class Demo06Max {
	public static void main (String[] args) {
		int a=100;
		int b=20;
		//����ʹ����Ԫ�����
		//int max=a>b ��a:b
		
		int max= a>b ? a:b;
		System.out.println("���ֵ�ǣ�"+max);
		
		//ʹ��if���
		
		if (a>b) {
			max=a;
			
		} else {
			max=b;
		}
	}

}
