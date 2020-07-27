/*题目：求出1-100之间偶数的和。
 * 
 * 思路：
 * 1.既然范围已经确定了是1-100之间，那么就从1，2，3，
 * 
 */
public class Demo12HundredSum {
	public static void main (String[] args) {
		int sum=0; //用来叠加的存钱罐
		
		for (int i=1; i<=100; i++) {
			if (i%2==0) { //如果是偶数
				sum +=i; // sum=sum+i
				
			}
			
			
		} 
		System.out.println("结果是： "+sum);
		
		System.out.println("=================== ");
		
		//题目：求出1-100之间奇数的和。
		
		
		int b=0;
		
		for (int a=1; a <=100; a++) {
			if (a%2!=0) { //如果是奇数
				b+=a;
			}
		}
		System.out.println("result is: "+ b);
		
		System.out.println("=================== ");
		
		int result;
		result= sum+b;
		
		System.out.println("result is: "+ result); // 上面两题结果的和。
		
		System.out.println("=================== ");
		
		//题目：打印1-100之间的偶数
		
		for (int c=1; c<=100; c++) {
			if(c%2==0) {
				System.out.println("打印1-100之间的偶数"+c);
				
			}
					}
		
		
		
		
	}

}
