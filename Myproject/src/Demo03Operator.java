/*
 * ������������ض������ķ��ţ����磺+
 * ���ʽ����������������Ĺ�ʽ�б��ʽ���磺a+b
 * 
 * �������㣺+ - * / %��ȡģ��
 * ȡģ��������/����=��...����
 * 
 * ȡģֻ��������ĳ�������������������塣
 * 
 * ע�����
 * 1.һ�����㵱���в�ͬ���͵����ݣ���ô��������������ͷ�Χ�������
 

 */
public class Demo03Operator {
	public static void main(String[] args) { 
		
		System.out.println(10+20); //30,��������֮�����������ӡ���
		
		int a=10, b=20;
		System.out.println(a-b); //-10����������֮��Ҳ����������ӡ���
		
		int result1=a*b;
		System.out.println(result1);
		
		int x=10,y=3;
		int result2=x/y;
		System.out.println(result2);
		
		int result3=x%y;
		System.out.println(result3); // ȡģ�����ֻ��ʾ����1
		
		//һ�����㵱���в�ͬ���͵����ݣ���ô��������������ͷ�Χ�������
		
		//x��int���͵ģ�int+double---��double+double---��double
		double result4=x+2.5;
		System.out.println(result4); //12.5
		
		
		/*�����ʽ������ᱨ��
		 * float result6=result4+12.5��
		 * ��Ϊ���н�����������ͷ�Χ���Ϊ����float��Χ��doubleС��
		 */
		
		//����ǿ������ת���Ժ����н����25
		float result6=(float)(result4+12.5);
		System.out.println(result6);
		
		//byte short char�ڽ�������ʱ�����ᱻ�Զ�����Ϊint���ͣ��ڽ������㡣
		
		
		
		
		
		
	}

}
