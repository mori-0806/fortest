package moriUse;

/*
 * ==�ǶԶ���ĵ�ֵַ���бȽϣ�
 * String str1 = hello;
 * String str2 = hello;
 * char[] charArryList = {'h','e','l','l','o'};
 * String str3 = new String[charArryList];
 * system.out.println(str1==str2)//true
 * system.out.println(str1==str3)//false
 * 
  * �����Ҫ�ַ��������ݱȽϣ�����ʹ����������
 * public boolean equals(object obj); 
  * �����������κζ���ֻ�в�����һ���ַ�������������ͬ�Ż���true��������false
  * ע������
 * 1.�κζ�������object����
 * 2.equal�������жԳ��ԣ�Ҳ����a.equal(b)��b.equal(a)Ч��һ��
 * 3.����Ƚ�˫����һ���������Ƽ��ѳ����ŵ�ǰ��
  *    �Ƽ�"abc".equal(str)  ���Ƽ� str.equal("abc")
 * 
 * public boolean equalsIganoreCase(String str); ���Դ�Сд���ݱȽ�
 * 
 * 
 */


public class Day08Demo01StringEquals {

	public static void main(String[] args) {
		 String str1 = "hello";
		 String str2 = "hello";
		 char[] charArryList = {'h','e','l','l','o'};
		 String str3 = new String(charArryList);
		
		System.out.println(str1.equals(str2));//true
		System.out.println(str1.equals(str3));//true
		
		
		System.out.println("----------------------------");
		
		 String str4 = "abc";
		 String str5 = "Abc";
		
		System.out.println(str4.equals(str5));//false
		System.out.println(str4.equalsIgnoreCase(str5));//true
	
	}


}
