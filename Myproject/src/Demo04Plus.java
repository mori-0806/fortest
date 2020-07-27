/*四则运行当中的“+”有常见的三种用法：
 * 1.数值的加法运算
 * 2.对于字符char类型来说，在计算之前会被自动提升为int类，再计算，例如A+1=65
 * 3.对于字符串String（首字母大写，并不是关键字）来说，“+”代表字符串连接操作。
 * 例如hello+world。
 * 任何数据类型和String字符串连接的时候，结果都会变成字符串。
 * 
 */


public class Demo04Plus {
	public static void main(String[] args) {
		//字符串类型的变量基本使用
		//数据类型string 变量名称=数据值
		System.out.println("hello");
		
		//字符串String用加号连接用法
		System.out.println("hello"+"kana");
		
		//String类型+int类型用法
		//String+int--->String
		
		String str1="Mad world";
		System.out.println(str1+2020);
		
		//优先级问题
		//String+int+int
		//String +int
		//String
		
		System.out.println(str1+20+30);//运行结果依然是string类型，Mad world2030
		//如果需要在string类型的语句中进行运算，需要将运算公式用小括号括起来
		System.out.println(str1+(20+30));
		

		
		
	}

}
