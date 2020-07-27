package moriUse;
/*
  * 分割字符串的方法；
 * public String[] split(String regex);
  *   按照参数的规则，将字符串切分成为若干部分
 *  
  *   注意事项
 * split方法的参数其实是一个正则表达式，今后学习
 * 如果按照英文句点"."进行切割，必须写"\\."(两个反斜杠)
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
