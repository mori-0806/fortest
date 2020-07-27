/*
 * 对于byte/short/char三种类型来说，如果右侧赋值的数值没有超过范围，
 * 那么javac编译器将会自动隐含地补上一个（byte）（short）（char）。
 * 
 * 1.如果没有超过左侧的范围，编译器不上强转。
 * 2.如果右侧超过了左侧范围，编译器直接报错。
 */
public class Demo11Notice {
	public static void main(String[] args) {
		
		byte num1=/*（byte）*/ 30; //右边是int数字，但是没有超过左侧的范围，就是正确的。
		//int-->byte, 不是自动类型转换
		System.out.println(num1); //30;
		
		// byte num2=128，右侧超过了左侧的数据范围
		
		char zifu=/*(char)*/65;
		System.out.println(zifu); 
		//int-->char,没有超过范围，编译器会自动补上一个隐含的(char)
		
		
			
		
		
	}

}
