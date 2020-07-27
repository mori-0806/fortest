
public class DemoArry {
	
 public static void main(String[] args) { 


  int[] result = calculate (2,1,3);
  System.out.println(result[0]);
  System.out.println(result[1]);
  System.out.println(result);
  System.out.println(DemoArry.calculate(2, 3, 3)[0]); 
////  DemoArry.test();
//  System.out.println(result[0]);
//  System.out.println(result[1]);
// 
 }
	 
  
 public static int[] calculate(int a, int b, int c) {
	 int sum = a + b + c;
	 int avg = sum/3;
	 int[] arry = {sum,avg};
//	 System.out.println(arry);
	 return arry;
	
 }
// public void test() {
// for (int i= 1 ,j = i-1; j < i ;i++, j--) {
//	  if (i == 4) {
//		  break;
//	  }
//	 System.out.println("TEST"+i);
//	 
// }
//
// 
// }

}
