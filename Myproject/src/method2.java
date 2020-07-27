
public class method2 {

	static String sendmsg(String X,String Y)
	{
	return "收件人：" + X+" "+"内容："+Y;		
	}
	public static void main(String[] args) 
	
	{	
     String sum = method2.sendmsg("10086","你的手机已欠费");
		System.out.println(sum);
		 //sum = method2.getSum(7,6);
		 //System.out.println(sum+"円");
	}

}
