package demo;
/*
数组的初始化：在内存当中创建一个数组，并且向其中赋予一些默认值。

1.两种常见的初始化方式：
 a. 动态初始化（指定长度）在创建数组的时候，直接指定数组当中的数据元素个数。
 b. 静态初始化（指定内容）在创建数组的时候，不直接指定数据个数多少，而是直接将具体的数据内容进行指定。

2.动态初始化数组的格式：
        数据类型[] 数组名称 = new 数据类型[数组长度];

3.静态初始化基本格式：
    标准格式：
        数据类型[] 数组名称 = new 数据类型[] { 元素1, 元素2, ... };
    省略格式：
       数据类型[] 数组名称 = { 元素1, 元素2, ... };

*/
public class array {
	  public static void main(String[] args) {
		  //动态初始化
		//创建一个数组arrayA,里面能存放5个字符串  
		  //格式：数据类型[] 数组名称 = new 数据类型[数组长度];
		  String[] arrayA = new String[5];
		  
		  //分别给5个字符串赋值
		  arrayA[0]="我是arrayA的0号元素";
		  arrayA[1]="我是arrayA的1号元素";
		  arrayA[2]="我是arrayA的2号元素";
		  arrayA[3]="我是arrayA的3号元素";
		  arrayA[4]="我是arrayA的4号元素";
//		  arrayA[5]="我是arrayA的4号元素";
		  
		  //分别打印数组的元素
		  System.out.println(arrayA[0]);//我是arrayA的0号元素
		  System.out.println(arrayA[1]);//我是arrayA的1号元素
		  System.out.println(arrayA[2]);//我是arrayA的2号元素
		  System.out.println(arrayA[3]);//我是arrayA的3号元素
		  System.out.println(arrayA[4]);//我是arrayA的4号元素
		  
		  System.out.println("----------------------------------");
		  
		  for (String string : arrayA) {
			System.out.println(string);
		}
		  
		  //遍历打印出数组中的所有元素
		  //arrayA.length代表的是数组arrayA的长度
//		  for (int i = 0; i < arrayA.length; i++) {
//			System.out.println(arrayA[i]);
//		}
	    }
	}
