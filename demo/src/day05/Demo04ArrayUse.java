package day05;

/*
  * ֱ�Ӵ�ӡ�������ƣ��õ����������Ӧ�ģ��ڴ��ַ��ϣֵ��
 *
  *��������Ԫ�صĸ�ʽ����������{����ֵ}
  * ����ֵ������һ��int���֣��������鵱��Ԫ�صı�š�
  *��ע�⡿������0��ʼ��һֱ������ĳ���-1Ϊֹ��
 * 
 */


public class Demo04ArrayUse {
	
	public static void main(String[] args) {
		//��̬��ʼ����ʡ�Ը�ʽ
		int[] array = {10,20,30};
		System.out.println(array);//�õ������ڴ��ַ��ϣֵ[I@15db9742
		
		//ֱ�Ӵ�ӡ�����е�Ԫ��
		System.out.println(array[0]);//0��Ԫ��ֵ 10
		System.out.println(array[1]);//1��Ԫ��ֵ 20
		System.out.println(array[2]);//2��Ԫ��ֵ 30
		System.out.println("----------------------");
		
		//Ҳ���Խ����鵱�е�ĳһ������Ԫ�أ���ֵ��������
		int num =array[1];
		System.out.println(num);//num��ֵΪ����1��Ԫ��ֵ 20
		
	}
	

}
