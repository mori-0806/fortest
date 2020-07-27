
public class demo02Variable {
	public static void main(String[] args) {
		
		//创建一个变量
		//格式：数据类型，变量名称
		
		int num1;
		
		//向变量名称存储数据值
		
		num1 = 15;
	
		//一步到位的格式
		//格式：数据类型，变量名称=数据值
		
		int num2 = 10; 
		
		System.out.println(num2);
		
		int a=1;
		int b=2;
		int c=3;
		System.out.println("a的值是"+a+" "+ "b的值是"+b+" "+"c的值是"+c);
		
		
		System.out.println("=============");
		
		byte num3=120; //byte取值范围：-128~127
		
		System.out.println(num3);
		
		short num4=300; //short取值范围：-32768（-2^15）~ 32767（2^15 - 1）
		System.out.println(num4);
		
		long num5=3000000000L; //记得加上后缀L,需大写
		System.out.println(num5);
		
		float num6=3.14F; //记得加上后缀F,需大写
		System.out.println(num6);
		
		char zifu='a';
		System.out.println(zifu);
		
		zifu='賀';
		System.out.println(zifu);
		
		boolean var1=true;
		System.out.println(var1);
		
		var1=false;
		System.out.println(var1);
		
		boolean var2=var1; 
		
		//将一个变量的内容赋值给另一个变量
		//右侧的变量名称var1已经存在，里面是false布尔值
		//将右侧的布尔值向左，交给var2变量进行存储
		
		System.out.println(var2);
		
		
		    
		    
		    		
	
		
	}
		
	

}
