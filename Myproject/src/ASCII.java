/* 数字和字符对照关系表（编码表）
 * ASCII编码表：American Standard Code Information Interchange,美国信息交换标准代码。
 * Unicode码表：万国码，也是数字与字符的对照关系，开头-127和ASCII完全一样，从128开始包含更多字符，
 * emoji等
 * 48=0
 * 65=A
   97=a
   */
public class ASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char zifu1='A';
		System.out.println(zifu1+1); //结果是66
		
		char zifu2='A';
		System.out.println(zifu2); //其实底层是数字65
		
		char zifu3='c';
		int num1=zifu3;
		//左侧是int类型，右边是char类型
		//char-->int，符合从小到大的规则，因此发生了自动类型转换。
		
		System.out.println(num1); //int是整数类，结果是99
		
		char zifu4='中';
		System.out.println(zifu4+0); //结果是20013
	

	}

}
