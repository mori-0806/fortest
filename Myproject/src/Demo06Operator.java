/*赋值运算符分为：
 * 基本赋值运算符：就是一个等号“=”，代表将右侧的数据交给左侧的变量；
 * int a=10
 * 
 * 复合赋值运算符：
 *  +=  a += 3 相当于 a = a+3；
 *  -=  b -= 4 相当于 b = b-4;
 *  *=  c *= 5 相当于 c = c*5；
 *  /=  d /= 6 相当于 d = d/6
 *  %=  e %=7  相当于 e = e%7；
 *  
 *  注意事项：
 *  1.只有变量才能使用赋值运算符，常量不能进行赋值；错误例子：50=30，
 *  2.复合赋值运算符其中隐含了一个强制类型转换。
 *  
 */
		 
public class Demo06Operator {
	public static void main(String[] args) {
		
		int a=10;
		//按照公式进行翻译：a = a+5
		//a = 10+5
		//a = 15
		//a本来是10，现在重新赋值得到15；
		
		a += 5;
		System.out.println(a);//结果是15；
		
		int e=10;
		e=e%3;
		
		//e=e%3；
		//e=10%3
		//e=1
		
		System.out.println(e); //运行结果是1；
		
		byte num = 30;
		//num = num+5
		//num = byte+int(此时公式里的num是byte类型)
		//num = int+int （byte/short/char这三种类型在运算的时候，都会被先提升为int类型然后再计算。）
		//因此，num=int
		//num=（byte）int
		num+=5;
		System.out.println(num); //结果是35
		
		
		
		
				
				
		
		
		
	}

}
