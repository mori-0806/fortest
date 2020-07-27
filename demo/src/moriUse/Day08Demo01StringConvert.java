package moriUse;
/*
 * string当中与转化相关的常用方法
 * public char [] toCharArray();将当前字符串拆分成为字符数组作为返回值
 * public byte [] getBytes();获取
 * public string place(CharSequence oldString,CharSequence newString) 
  * 将所有出现的老字符串替换成为新的字符串，返回替换之后的结果新字符串
 *  
 * */
public class Day08Demo01StringConvert {
	public static void main(String[] args) {
		//转换成为字符数组
		String str = "helloworld";
		char[] chars = str.toCharArray();
		System.out.println(chars.length);
		System.out.println(chars[1]);
		for (int i = 0; i < chars.length; i++) {
			System.out.println(chars[i]);
		}
		
		System.out.println("-----------------------");
		
		//转换成为字节数组
		byte[] bytes = "helloworld".getBytes();
		for (int i = 0; i < bytes.length; i++) {
		System.out.println(bytes[i]);	
		}
		
		System.out.println("-----------------------");
		
		//字符串内容替换
		String str1 = "fuck you";
		String str2 = str1.replace("uc", "**");
		System.out.println(str1);
		System.out.println(str2);
	}

	
	
}
