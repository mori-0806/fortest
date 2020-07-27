package moriUse;
/*
 * math类是数学相关的工具类，里面提供了大量的静态方法，完成与数学运算相关的操作。
 * 
 * public static double abs(double num);获取绝对值，有多种重载。
 * public static double ceil(double num);向上取整。
 * public static double floor(double num);向下取整。
 * public static long round(double num);四舍五入。
 * */
public class Day08Demo03Math {
  public static void main(String[] args) {
	  //获取绝对值
	  System.out.println(Math.abs(-999.999));//999.999
	  
	  //向上取整
	  System.out.println(Math.ceil(999.999));//1000.0
	  System.out.println(Math.ceil(999.111));//1000.0
	  
	  //向下取整
	  System.out.println(Math.floor(999.999));//999.0
	  System.out.println(Math.floor(999.111));//999.0
	  
	  //四舍五入
	  System.out.println(Math.round(999.999));//1000
	  System.out.println(Math.round(999.111));//999
}
}
