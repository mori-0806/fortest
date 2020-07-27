/*
 * 比较运算符：
 * 大于 >
 * 小于<
 * 大于等于>=
 * 小于等于<=
 * 相等==
 * 不等于!=
 * 
 * 注意事项：
 * 1.比较运算符的结果一定是一个boolean值，成立就是true，不成立就是false
 * 2.如果进行多次判断，不能连着写，例如1<X<3
 * 程序当中【不允许】这种写法；
 */

public class Demo07Operator {
	public static void main (String[] args) {
		System.out.println(10>5); //true
		
		int num1=10;
		int num2=6;
		System.out.println(num1>num2); //true
		System.out.println(num1>=100);// false
		System.out.println(num2<7);
		
		System.out.println(10==10);
		System.out.println(20!=25);
		System.out.println(20!=20);
		
		int x=10;
		//System.out.println(2<x<12); 错误写法，编译报错，不能连着写。
		
		
		
		
		
		
	}

}
