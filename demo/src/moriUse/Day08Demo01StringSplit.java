package moriUse;
/*
  * �ָ��ַ����ķ�����
 * public String[] split(String regex);
  *   ���ղ����Ĺ��򣬽��ַ����зֳ�Ϊ���ɲ���
 *  
  *   ע������
 * split�����Ĳ�����ʵ��һ��������ʽ�����ѧϰ
 * �������Ӣ�ľ��"."�����и����д"\\."(������б��)
 * */
public class Day08Demo01StringSplit {
	public static void main(String[] args) {
		String str1 = "aaa,bbb,ccc,ddd";
		String[] str2 = str1.split(",");
		System.out.println(str2.length);
		for (int i = 0; i < str2.length; i++) {
			System.out.println(str2[i]);//aaa bbb ccc ddd
		}
		
		System.out.println("--------------");
		
		String str3 = "aaa.bbb.ccc.ddd";
		String[] str4 = str3.split("\\.");
		for (int i = 0; i < str4.length; i++) {
			System.out.println(str4[i]);
		}
		
	
	}	
	
}
