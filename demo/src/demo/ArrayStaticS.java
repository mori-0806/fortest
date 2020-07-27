package demo;
/*
静态初始化（指定内容）;
在创建数组的时候，不直接指定数据个数多少，而是直接将具体的数据内容进行指定。

静态初始化省略格式：
  省略格式：
     数据类型[] 数组名称 = { 元素1, 元素2, ... };

*/
public class ArrayStaticS {
	  public static void main(String[] args) {
	        // 用静态初始化标准格式
		  // 创建一个数组，用来装字符串： "你好"、"hello"、"こんにちは"
	        String[] array = { "你好", "hello", "こんにちは" };
	 
	        //分别打印数组array的元素
	        System.out.println(array[0]); //你好
	        System.out.println(array[1]); // hello
	        System.out.println(array[2]); // こんにちは
	        
	        System.out.println("--------------------------");
	 
	      //遍历打印出数组中的所有元素
	        for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
	    }
	

}
