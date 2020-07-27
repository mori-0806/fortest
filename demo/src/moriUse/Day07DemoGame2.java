package moriUse;

import java.util.Random;
import java.util.Scanner;

public class Day07DemoGame2 {

	public static void main(String[] args) {
	Random r = new 	Random();
	int randomNum = r.nextInt(10)+1;
  
	Scanner sc = new Scanner(System.in);

	for (int i = 0; i < 10; i++) {
		System.out.println("ÇëÊäÈëÄã²ÂµÄÊý×Ö");
	int guessNum = sc.nextInt();
	
	if (randomNum > guessNum) {
		System.out.println("Äã²ÂµÄÌ«Ð¡À²");
	}else if (randomNum < guessNum) {
		System.out.println("Äã²ÂµÄÌ«´óÀ²");
	}else {
		System.out.println("¹§Ï²Äã²ÂÖÐÀ²");
		break;
	}
		
	}
	
	 System.out.println("GAME OVER");
	
	}
	

}
