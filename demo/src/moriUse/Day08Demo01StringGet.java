package moriUse;
/*
 * String�������ȡ��صĳ��÷���
 * 
 * public int length();��ȡ�ַ����к��е��ַ��������õ��ַ�������
 * public String concat(String str);����ǰ�ַ����Ͳ����ַ���ƴ�ӳ�Ϊ����ֵ��Ϊ�µ��ַ���
 * public char chartAt(int index) ;��ȡָ������λ�õĵ����ַ���������0��ʼ��
 * public int indexof(String str);���Ҳ����ַ����ڱ��ַ��������״γ��ֵ�����λ�ã����û�з���-1ֵ
 * 
 * */



public class Day08Demo01StringGet {
	private static final String LLO = null;

	public static void main(String[] args) {
	//��ȡ�ַ����ĳ���
	int length = "ededededefdfsadfa".length();
	System.out.println("�ַ����ĳ����ǣ�"+ length);
		
	//ƴ���ַ���
	String str1 = "HELLO";
	String str2 = "world";
	String str3 =str1.concat(str2);
	System.out.println(str3);//HELLOworld
	
	//��ȡָ������λ�õĵ����ַ�
		
	System.out.println("str3��6��������λ���ǣ�"+ str3.charAt(6));//o
	
	//���Ҳ����ַ����ڱ��ַ��������״γ��ֵ�����λ�ã����û�з���-1ֵ
	
	System.out.println("LLO��str3���״γ��ֵ�λ���ǣ�"+ str3.indexOf("LLO"));//2
	}
	
	

}
