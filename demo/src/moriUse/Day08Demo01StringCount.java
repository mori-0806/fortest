package moriUse;

import java.util.Scanner;

/*
  * ��Ŀ��
  * ����ͳ���ַ���������ͳ�����и����ַ����ֵĴ���
  *�����У� ��д��ĸ��Сд��ĸ�����֣�����
 * 
 * */

public class Day08Demo01StringCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please input");
		String input = sc.next();
		
		int countUpper =0;//��д��ĸ
		int countLower =0;//Сд��ĸ
		int countNumber =0;//����
		int countOther =0;//�����ַ�
		
		char[] charArry = input.toCharArray();
		for (int i = 0; i < charArry.length; i++) { 
			char ch = charArry[i];//��ǰ�����ַ�
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
		System.out.println("��д��ĸ��"  + countUpper);
		System.out.println("��д��ĸ��"  + countLower);
		System.out.println("������"      + countNumber);
		System.out.println("�����ַ���"  + countOther);

	
	}

}
