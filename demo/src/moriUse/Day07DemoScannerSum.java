package moriUse;

import java.util.Scanner;

public class Day07DemoScannerSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������");
		int a =sc.nextInt();
		
		System.out.println("������ڶ�������");
		int b =sc.nextInt();

		System.out.println("���������������");
		int c =sc.nextInt();
		
		int sum = a + b +c;
		System.out.println("��͵Ľ����" + sum);
		
		System.out.println("---------------");
		
		if(a>b && a>c) {
			System.out.println("���ֵ" + a);
		}else if(b>c) {
			System.out.println("���ֵ" + b);
		}else {
			System.out.println("���ֵ" + c);
		}
		//��Ԫ��������㷨
		
		int tep  = a > b ? a : b;
		int max = tep>c ? tep:c;
		System.out.println("���ֵ" + max);
		
	}

}
