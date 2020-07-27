package moriUse;

import java.util.Scanner;

public class Day07DemoScannerSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数字");
		int a =sc.nextInt();
		
		System.out.println("请输入第二个数字");
		int b =sc.nextInt();

		System.out.println("请输入第三个数字");
		int c =sc.nextInt();
		
		int sum = a + b +c;
		System.out.println("求和的结果是" + sum);
		
		System.out.println("---------------");
		
		if(a>b && a>c) {
			System.out.println("最大值" + a);
		}else if(b>c) {
			System.out.println("最大值" + b);
		}else {
			System.out.println("最大值" + c);
		}
		//三元运算符的算法
		
		int tep  = a > b ? a : b;
		int max = tep>c ? tep:c;
		System.out.println("最大值" + max);
		
	}

}
