/*
 * ����һ�������ĸ�ʽ��
 * public static void �������ƣ���{
 *    ������
 * }
 * 
 * 
�������Ƶ���������ͱ���һ����
ʹ��С�շ壨��һ����������ĸСд���ڶ������ʿ�ʼ��ÿ����������ĸҪ��д����
�����壺�����ŵ��п��԰�����������䡣

ע������:
1.����������Ⱥ�˳������ν��
2.�����Ķ��岻�ܲ���Ƕ�װ�����ϵ��������һ���������ܷŵ���һ�����������棩
3.�����������֮�󣬲���ִ�У������ִ�У�һ��Ҫ���з����ġ����á���

��ε��÷�������ʽ��

��������();

*/

public class Demo10Method {
	public static void main(String[] args) {
		
		
		cook();//���ó��ӵķ�������������();
		seller();//����С�̷��ķ���
		fammer();//����ũ��ķ���
		me();//�����ҵķ���
		
		
		}
	
	public static void fammer() {
		//ũ��
				System.out.println("����");
				System.out.println("��ˮ");
				System.out.println("ʩ��");
		
	}
	
	public static void seller() {
		//С�̷�
				System.out.println("ߺ��");
				System.out.println("��������");
		
	}
	
	public static void cook() {
		//����
				System.out.println("װ��");
		
	}
	
	public static void me() {
		//��
				System.out.println("��");
		
	}

	
}
