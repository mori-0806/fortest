package demo;
/*
 静态初始化（指定内容）;
 在创建数组的时候，不直接指定数据个数多少，而是直接将具体的数据内容进行指定。

静态初始化基本格式：
   标准格式：
       数据类型[] 数组名称 = new 数据类型[] { 元素1, 元素2, ... };

*/
public class ArrayStatic {
	public static void main(String[] args) {
        // 用静态初始化标准格式
		// 直接创建一个数组，里面装的全都是int数字，具体为：5、15、25、40
        int[] arrayA = new int[] { 5, 15, 25, 40 };
 
        // 创建一个数组，用来装字符串："Hello"、"World"、"Java"
        String[] arrayB = new String[] { "Hello", "World", "Java" };
        
        //分别打印数组arrayA和arrayB的元素
		  System.out.println(arrayA[0]);//5
		  System.out.println(arrayA[1]);//15
		  System.out.println(arrayA[2]);//25
		  System.out.println(arrayA[3]);//40
		  
		  System.out.println(arrayB[0]);//Hello
		  System.out.println(arrayB[1]);//World
		  System.out.println(arrayB[2]);//Java
		  
		  System.out.println("------------------------");
		  
		//遍历打印出arrayA和arrayB的元素
		  //arrayA
		  for (int i = 0; i < arrayA.length; i++) {
			System.out.println(arrayA[i]);
		}
		//arrayB
		  for (int i = 0; i < arrayB.length; i++) {
				System.out.println(arrayB[i]);
			}
		
	}

}
