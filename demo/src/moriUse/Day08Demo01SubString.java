package moriUse;
/*
  * �ַ����Ķ��ȡ����
  * Public string substring(int index);��ȡ�Ӳ���λ��һֱ���ַ���ĩβ���������ַ���
  * Public string substring(int begin,int end);��ȡ��begin��ʼ��һֱ��end�������м���ַ���
    *   ��ע[begin,end)������ߣ��������ұ�
    *   
  * */


public class Day08Demo01SubString {
	public static void main(String[] args) {
		String str = "helloworld";
		System.out.println(str.substring(0));//helloworld
		System.out.println(str.substring(5, 10));//world
		Day08Demo03Math.main(args);
		
	}

	
}
