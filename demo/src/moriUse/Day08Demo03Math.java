package moriUse;
/*
 * math������ѧ��صĹ����࣬�����ṩ�˴����ľ�̬�������������ѧ������صĲ�����
 * 
 * public static double abs(double num);��ȡ����ֵ���ж������ء�
 * public static double ceil(double num);����ȡ����
 * public static double floor(double num);����ȡ����
 * public static long round(double num);�������롣
 * */
public class Day08Demo03Math {
  public static void main(String[] args) {
	  //��ȡ����ֵ
	  System.out.println(Math.abs(-999.999));//999.999
	  
	  //����ȡ��
	  System.out.println(Math.ceil(999.999));//1000.0
	  System.out.println(Math.ceil(999.111));//1000.0
	  
	  //����ȡ��
	  System.out.println(Math.floor(999.999));//999.0
	  System.out.println(Math.floor(999.111));//999.0
	  
	  //��������
	  System.out.println(Math.round(999.999));//1000
	  System.out.println(Math.round(999.111));//999
}
}
