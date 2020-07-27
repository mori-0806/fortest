package moriUse;

import java.util.Scanner;

/*
  * 题目；
  * 键盘统计字符串，并且统计其中各种字符出现的次数
  *种类有； 大写字母，小写字母，数字，其他
 * 
 * */

public class Day08Demo01StringCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please input");
		String input = sc.next();
		
		int countUpper =0;//大写字母
		int countLower =0;//小写字母
		int countNumber =0;//数字
		int countOther =0;//其他字符
		
		char[] charArry = input.toCharArray();
		for (int i = 0; i < charArry.length; i++) { 
			char ch = charArry[i];//当前单个字符
			if (ch>='A'&&ch<='Z') {
				countUpper++;
			}else if(ch>='a'&&ch<='z') {
				countLower++;
			}else if (ch>=0&&ch<=9) {
				countNumber++;
			}else {
				countOther++;
			}
			
		}
		System.out.println("大写字母有"  + countUpper);
		System.out.println("大写字母有"  + countLower);
		System.out.println("数字有"      + countNumber);
		System.out.println("其他字符有"  + countOther);

	
	}

}
