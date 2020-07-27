package moriUse;

/*
 * ==是对对象的地址值进行比较，
 * String str1 = hello;
 * String str2 = hello;
 * char[] charArryList = {'h','e','l','l','o'};
 * String str3 = new String[charArryList];
 * system.out.println(str1==str2)//true
 * system.out.println(str1==str3)//false
 * 
  * 如果需要字符串的内容比较，可以使用两个方法
 * public boolean equals(object obj); 
  * 参数可以是任何对象只有参数是一个字符串并且内容相同才会是true，否则是false
  * 注意事项
 * 1.任何对象都能用object接受
 * 2.equal方法具有对称性，也就是a.equal(b)和b.equal(a)效果一样
 * 3.如果比较双方有一个常量，推荐把常量放到前面
  *    推荐"abc".equal(str)  不推荐 str.equal("abc")
 * 
 * public boolean equalsIganoreCase(String str); 忽略大小写内容比较
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
