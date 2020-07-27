/*与（并且）&&
 *或（或者）||
 *非（取反）!
 * 
 * 与"&&" 或"||"，具有短路效果，如果根据左边已经可以判断得到最终结果，那边右边的代码将不再执行，
 * 从而节省一定的性能。
 * 
 * 注意事项：
 * 1.逻辑运算符，智能用于boolean值，
 * 2.与，或需要左右都有布尔值，但是取反只要有一个布尔值即可。
 * 3.与或两种运算符，如果有多个条件，可以连续写。
 * 两个条件：条件A &&条件B
 * 多个条件：条件A &&条件B &&条件C
 * 
 * TIPS:
 * 对于1<X<3的情况，应该拆成两个部分，然后用运算符连接起来：
 * int x=2
 * 1<x && x<3
 * 
 */
public class Demo08Logic {
	public static void main(String[] args) {
		System.out.println(true && true); // true&&true-->true
		System.out.println(true && false);// false
		
		System.out.println(5<6 && 7>5); //true
		System.out.println("================");
		
		System.out.println(true || false); //true
		System.out.println(false || false); //false
		System.out.println(true || true); //true
		System.out.println(7!=8 || 7>3); //true
		
		System.out.println("================");
		
		System.out.println(!true); // false
		System.out.println(!false); //true
		
	    int a=10;
	    System.out.println(3>4 && ++a<100); //false，因为左边的代码结果为false，右边的代码也就不再执行了。
	    System.out.println(a);// 基于以上原因， a没有+1,仍然是10；
	    
	    int b=20;
	    System.out.println(5<8 || ++b>10); //true
	    System.out.println(b);//因为左边已经可以知道运行结果为true，因此右边的代码不再执行，b依然是20；
	    
	    
		
		
	}

}
