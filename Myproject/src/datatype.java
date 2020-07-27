/*
 * 强制类型转换
 * 1.特点：代码需要进行特殊的格式处理，不能自动转换
 * 2.格式：范围小的数据类型 范围小的变量名=(范围下的数据类型)原本范围大的数据；
 * 
 * 注意事项
 * 1.强制类型转换，不推荐使用，因为可能导致精度损失，数据溢出
 * 2.byte/short/char这三种类型都可以发生数学运算，例如“+”
 * 3.byte/short/char这三种类型在运算的时候，都会被先提升为int类型然后再计算。
 * 4.boolean类型不能发生数据类型转换
 */
public class datatype {
	public static void main(String[] args) {
		
		//左边是int类型，右边是long类型，不一样
		//long-->int，long是大于int类型的，不符合从小到大的规则
		//不能自动转换，需转换格式强制转换数据类型
		//格式：范围小的数据类型 范围小的变量名=(范围下的数据类型)原本范围大的数据；
		
		int a=(int)100L;
		System.out.println(a);
		
		//左边是long类型，右边是float类型
		//float-->long，float类型是大于long类型的，不符合从小到大的规则
		//需强制转换格式如下
		
		//一般不推荐强制转换，容易导致数据精度损失，数据溢出
		long b=(long)2.5F;
		System.out.println(b);// 运行结果不是2.5，是2
		
		int c=(int)6000000000L;
		System.out.println(c); //数据溢出：运行结果不是60个亿，是1705032704（int最大取值范围是20个亿）
		
		//double-->int 小数变整数，需强制转换
		
		int z=(int)3.5;
		System.out.println(z); 
		
		//运行结果不是3.5，是整数3，这不是四舍五入，小数部分全被舍弃掉，
		//强行格式转换，导致精度损失
		
		
		//计算机底层会用一个数字（二进制）来代表字符A，即65
		//一旦char字符进行了数字运行，那么字符就会按照一定的规则翻译为一个数字
		
		char zifu1='A';
		System.out.println(zifu1+1);//num1+1的运行结果是66，A被当作65进行处理
		
		byte num4=40;//右侧的数值不能超过左侧的类型范围
		byte num5=50;
		
		//因为byte在进行运算时，会先被提升为int类型
		//因此byte+byte-->int+int-->int
		
		int result1=num4+num5;
		System.out.println(result1);
		
		short num6=60;
		int result2=num4+num6;
		//byte+short-->int+int-->int
		System.out.println(result2);//运行结果为100
		
		short num7=70;
		//byte+short-->int+int-->int
		
		//以下情况为右边原本被提升为int类型，被强制转为short类型：
		//注意必须保证逻辑上真实数值的大小没有超过short范围，否则会发生数据溢出
		short result3=(short)(num4+num7);
		System.out.println(result3);//运行结果是100
				
		//char<int<long<float<double
	
		
		
		
		
	}
	
	
	

}
