package moriUse;
/*
 * string������ת����صĳ��÷���
 * public char [] toCharArray();����ǰ�ַ�����ֳ�Ϊ�ַ�������Ϊ����ֵ
 * public byte [] getBytes();��ȡ
 * public string place(CharSequence oldString,CharSequence newString) 
  * �����г��ֵ����ַ����滻��Ϊ�µ��ַ����������滻֮��Ľ�����ַ���
 *  
 * */
public class Day08Demo01StringConvert {
	public static void main(String[] args) {
		//ת����Ϊ�ַ�����
		String str = "helloworld";
		char[] chars = str.toCharArray();
		System.out.println(chars.length);
		System.out.println(chars[1]);
		for (int i = 0; i < chars.length; i++) {
			System.out.println(chars[i]);
		}
		
		System.out.println("-----------------------");
		
		//ת����Ϊ�ֽ�����
		byte[] bytes = "helloworld".getBytes();
		for (int i = 0; i < bytes.length; i++) {
		System.out.println(bytes[i]);	
		}
		
		System.out.println("-----------------------");
		
		//�ַ��������滻
		String str1 = "fuck you";
		String str2 = str1.replace("uc", "**");
		System.out.println(str1);
		System.out.println(str2);
	}

	
	
}
