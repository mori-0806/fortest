/*
 * 运算符：进行特定操作的符号，比如：+
 * 表达式：用运算符连起来的公式叫表达式比如：a+b
 * 
 * 四则运算：+ - * / %（取模）
 * 取模：被除数/除数=商...余数
 * 
 * 取模只针对整数的除法运算才有余数的意义。
 * 
 * 注意事项：
 * 1.一旦运算当中有不同类型的数据，那么结果会是数据类型范围大的那种
 

 */
public class Demo03Operator {
	public static void main(String[] args) { 
		
		System.out.println(10+20); //30,两个常量之间可以正常打印输出
		
		int a=10, b=20;
		System.out.println(a-b); //-10，两个变量之间也可以正常打印输出
		
		int result1=a*b;
		System.out.println(result1);
		
		int x=10,y=3;
		int result2=x/y;
		System.out.println(result2);
		
		int result3=x%y;
		System.out.println(result3); // 取模：结果只显示余数1
		
		//一旦运算当中有不同类型的数据，那么结果会是数据类型范围大的那种
		
		//x是int类型的，int+double---→double+double---→double
		double result4=x+2.5;
		System.out.println(result4); //12.5
		
		
		/*如果公式如下则会报错：
		 * float result6=result4+12.5，
		 * 因为运行结果以数据类型范围大的为主，float范围比double小。
		 */
		
		//尝试强制类型转换以后，运行结果是25
		float result6=(float)(result4+12.5);
		System.out.println(result6);
		
		//byte short char在进行运算时，都会被自动提升为int类型，在进行运算。
		
		
		
		
		
		
	}

}
