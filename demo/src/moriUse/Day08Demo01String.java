package moriUse;

public class Day08Demo01String {

public static void main(String[] args) {
	//使用空参构造
	String str1 = new String();
	System.out.println(str1);
	
	//根据字符数组创建字符串
	char[] chararrylist = {'a'};
	String str2 = new String(chararrylist);
	System.out.println(str2);
	
	//根据字节数组创建字符串
	byte[] byteArryList = {97,98,100};
	String str3 = new String(byteArryList);
	System.out.println(str3);
	
	//直接创建
	String str4 = "hello world";
	System.out.println(str4);
	
	
	
}

}
