/* 自增运算符：++
 * 自减运算符：--
 * 
 * 基本含义：让一个变量涨一个数字1或降一个数字1
 * 使用格式：写在变量名称之前或者之后都可以，例如：++num，num++
 * 使用方式：
 * 1.单独使用：不和其他操作混合，独立为一个步骤，例如++num；
 * 2.混合使用：与其他操作结合，例如与赋值或者和打印操作混合等。
 * 
 * 使用区别：
 * 1.单独使用时，++num和num++没有区别。
 * 2.混合使用时，有【重大区别】
 * A.如果是【前++】，变量会【立刻+1】，然后拿着结果进行使用。即【先加后用】
 * B.如果是【后++】，首先会使用变量本身的数值，然后变量再+1【先用后加】
 * 
 * 注意事项：
 * 只有变量才能使用自增，自减运算符，常量不可发生改变，所以不能用，比如30++。
 */
public class Demo05Operator {
	public static void main(String[] args) {
		
		int num1=10;
		System.out.println(num1);
		num1++;
		System.out.println(num1);//11,递增了数字1
		++num1;
		System.out.println(num1);//2，++num和num++没有区别。
		System.out.println("=================");
		
		//混合使用时，前++的举例说明
		int num2=20;
		System.out.println(++num2);//变量立刻+1，结果是21 
		System.out.println(num2);//21
		System.out.println(++num2);//在上一条输出结果的基础上+1，结果是22
		System.out.println(++num2);//在上一条输出结果的基础上+1，结果是23
		
		//混合使用时，后++的举例说明
		int num3=30;
		System.out.println(num3++);//先用变量本身的数值，然后再+1【先用后加】,result is 30
		System.out.println(num3);//变量+1，31
		
		System.out.println(num3++);//在上条结果的基础上，先用后加，结果是31
		System.out.println(num3);//result is 32
		
		System.out.println("=================");
		
		//【前--】与赋值的混合操作
		int num4=40;
		int result=--num4;
		System.out.println(result);//混合使用【前--】，变量立刻-1，结果39交给result变量。
		System.out.println(num4);//先减后用的原理，因此num4的结果也和result变量相同，是39
		System.out.println(--num4);//在上条运行结果的基础上-1.
		
		
		//【后--】与赋值的混合操作
		int num5=50;
		int result1=num5--;
		System.out.println(result1);//先用后减的原理，先把本来的50交给result1，结果是50
		System.out.println(num5);//先把本来的50交给result1，再-1，结果是49
		
		int x=30, y=40;
		int result2=++x+y--; //只供学习参考，实际开发时，并不建议这么写，代码简单易懂越好。
		
		System.out.println(result2); // 31+40=71
		System.out.println(x); //x+1=31
		System.out.println(y); //y-1=39
		
		
		
		
	}

}
