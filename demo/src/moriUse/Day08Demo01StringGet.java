package moriUse;
/*
 * String当中与获取相关的常用方法
 * 
 * public int length();获取字符串中含有的字符个数，拿到字符串长度
 * public String concat(String str);将当前字符串和参数字符串拼接成为返回值成为新的字符串
 * public char chartAt(int index) ;获取指定索引位置的单个字符（索引从0开始）
 * public int indexof(String str);查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回-1值
 * 
 * */



public class Day08Demo01StringGet {
	private static final String LLO = null;

	public static void main(String[] args) {
	//获取字符串的长度
	int length = "ededededefdfsadfa".length();
	System.out.println("字符串的长度是；"+ length);
		
	//拼接字符串
	String str1 = "HELLO";
	String str2 = "world";
	String str3 =str1.concat(str2);
	System.out.println(str3);//HELLOworld
	
	//获取指定索引位置的单个字符
		
	System.out.println("str3在6号索引的位置是；"+ str3.charAt(6));//o
	
	//查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回-1值
	
	System.out.println("LLO在str3中首次出现的位置是；"+ str3.indexOf("LLO"));//2
	}
	
	

}
