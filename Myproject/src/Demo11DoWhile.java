/* do-while循环的标准格式：
 * 
 * do {
 * 循环体
 * } while (条件判断);
 * 
 * 扩展格式：
 * 初始化语句；
 * do {
 * 循环体
 * 步进语句
 * } while(条件判断);
 * 
 * 
 */
public class Demo11DoWhile {
	public static void main (String[] args) {
		for (int i=1;i <=10; i++) {
		System.out.println ("对不起，我错了，请原谅我！"+ i);
		}
		System.out.println("==============================");
		
		
		
		
		
		int i=1; //1.初始化语句
		int sum=0;
		
		do { 	
			if (i%2==0) {
				sum+=i;
				
			}//3.循环体	
			
			i++; //4.步进语句
			
		} while (i<=100);//2.条件判断
		System.out.println("偶数的和"+sum); 	
		
	}

}
