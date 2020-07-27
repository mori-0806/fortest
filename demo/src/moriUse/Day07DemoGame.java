package moriUse;

import java.util.Random;
import java.util.Scanner;

public class Day07DemoGame {

	public static void main(String[] args) {
	Random r = new 	Random();
	int randomNum = r.nextInt(10)+1;
  
	Scanner sc = new Scanner(System.in);

	while (true) {
		
		System.out.println("ÇëÊäÈëÄã²ÂµÄÊı×Ö");
		int guessNum = sc.nextInt();
		
		if (randomNum > guessNum) {
			System.out.println("Äã²ÂµÄÌ«Ğ¡À²");
		}else if (randomNum < guessNum) {
			System.out.println("Äã²ÂµÄÌ«´óÀ²");
		}else {
			System.out.println("¹§Ï²Äã²ÂÖĞÀ²");
			break;
		}
		
	
	}
	
	 System.out.println("GAME OVER");
	
	
	
	}
	
	
	
	

}
