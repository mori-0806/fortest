package moriUse;
/*
  * 字符串的额截取方法
  * Public string substring(int index);截取从参数位置一直到字符串末尾，返回新字符串
  * Public string substring(int begin,int end);截取从begin开始，一直到end结束，中间的字符串
    *   备注[begin,end)包括左边，不包括右边
    *   
  * */


public class Day08Demo01SubString {
	public static void main(String[] args) {
		String str = "helloworld";
		System.out.println(str.substring(0));//helloworld
		System.out.println(str.substring(5, 10));//world
		Day08Demo03Math.main(args);
		
	}

	
}
