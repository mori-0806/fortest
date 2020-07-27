

public class study_day2 {

	
	
	
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		//可以通过一个语句来创建多个变量，但一般不推荐这么写。
		
		int a=10;
		int b=20;
		int c=30;
		
		System.out.println(a);
		
		int n=20, w=30;
		
		System.out.println(n);
		System.out.println(w);
		
		/*
		 * 当数据类型不一样时，将会发生数据类型转换。
		 * 自动类型转换（隐式）
		 * 1.特点：代码不需要进行特殊处理。自动完成
		 * 2.规则：数据范围从小到大
		 
		 * 强制类型转换（显式）
		 */
		
		System.out.println(1024);//整数，默认是int类型
		System.out.println(3.14);//浮点数，默认是double类型
		
		//左边是long类型，右边是int类型，左右数据类型不一样；
		//一个等号代表赋值，即将右侧的int常量交给左侧的long变量进行存储
		//int--> long 符合了数据范围从小到大的要求。
		//因此下行代码发生了自动类型转换。
		
		long num1=100;
		System.out.print(num1);
		
		//左边是double类型，右边是float类型，左右不同
		//float-->double，符合了数据范围从小到大的要求。
		//发生了自动类型转换。
		
		double num2=2.5F;
		System.out.println(num2);
		
		float num3=100L;
		System.out.println(num3);

	}

}
