package moriUse;

import java.util.Random;
import java.util.Scanner;

public class Day07DemoGame2 {

	public static void main(String[] args) {
	Random r = new 	Random();
	int randomNum = r.nextInt(10)+1;
  
	Scanner sc = new Scanner(System.in);

	for (int i = 0; i < 10; i++) {
		System.out.println("��������µ�����");
	int guessNum = sc.nextInt();
	
	if (randomNum > guessNum) {
		System.out.println("��µ�̫С��");
	}else if (randomNum < guessNum) {
		System.out.println("��µ�̫����");
	}else {
		System.out.println("��ϲ�������");
		break;
	}
		
	}
	
	 System.out.println("GAME OVER");
	
	}
	

}
