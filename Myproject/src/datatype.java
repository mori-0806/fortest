/*
 * ǿ������ת��
 * 1.�ص㣺������Ҫ��������ĸ�ʽ���������Զ�ת��
 * 2.��ʽ����ΧС���������� ��ΧС�ı�����=(��Χ�µ���������)ԭ����Χ������ݣ�
 * 
 * ע������
 * 1.ǿ������ת�������Ƽ�ʹ�ã���Ϊ���ܵ��¾�����ʧ���������
 * 2.byte/short/char���������Ͷ����Է�����ѧ���㣬���硰+��
 * 3.byte/short/char�����������������ʱ�򣬶��ᱻ������Ϊint����Ȼ���ټ��㡣
 * 4.boolean���Ͳ��ܷ�����������ת��
 */
public class datatype {
	public static void main(String[] args) {
		
		//�����int���ͣ��ұ���long���ͣ���һ��
		//long-->int��long�Ǵ���int���͵ģ������ϴ�С����Ĺ���
		//�����Զ�ת������ת����ʽǿ��ת����������
		//��ʽ����ΧС���������� ��ΧС�ı�����=(��Χ�µ���������)ԭ����Χ������ݣ�
		
		int a=(int)100L;
		System.out.println(a);
		
		//�����long���ͣ��ұ���float����
		//float-->long��float�����Ǵ���long���͵ģ������ϴ�С����Ĺ���
		//��ǿ��ת����ʽ����
		
		//һ�㲻�Ƽ�ǿ��ת�������׵������ݾ�����ʧ���������
		long b=(long)2.5F;
		System.out.println(b);// ���н������2.5����2
		
		int c=(int)6000000000L;
		System.out.println(c); //������������н������60���ڣ���1705032704��int���ȡֵ��Χ��20���ڣ�
		
		//double-->int С������������ǿ��ת��
		
		int z=(int)3.5;
		System.out.println(z); 
		
		//���н������3.5��������3���ⲻ���������룬С������ȫ����������
		//ǿ�и�ʽת�������¾�����ʧ
		
		
		//������ײ����һ�����֣������ƣ��������ַ�A����65
		//һ��char�ַ��������������У���ô�ַ��ͻᰴ��һ���Ĺ�����Ϊһ������
		
		char zifu1='A';
		System.out.println(zifu1+1);//num1+1�����н����66��A������65���д���
		
		byte num4=40;//�Ҳ����ֵ���ܳ����������ͷ�Χ
		byte num5=50;
		
		//��Ϊbyte�ڽ�������ʱ�����ȱ�����Ϊint����
		//���byte+byte-->int+int-->int
		
		int result1=num4+num5;
		System.out.println(result1);
		
		short num6=60;
		int result2=num4+num6;
		//byte+short-->int+int-->int
		System.out.println(result2);//���н��Ϊ100
		
		short num7=70;
		//byte+short-->int+int-->int
		
		//�������Ϊ�ұ�ԭ��������Ϊint���ͣ���ǿ��תΪshort���ͣ�
		//ע����뱣֤�߼�����ʵ��ֵ�Ĵ�Сû�г���short��Χ������ᷢ���������
		short result3=(short)(num4+num7);
		System.out.println(result3);//���н����100
				
		//char<int<long<float<double
	
		
		
		
		
	}
	
	
	

}
