package moriUse;

import java.util.Random;

/*
 * Random�����������������
 * 1.���� 
 * import java.util.Random;
 * 
 * 2.����
 * Random r = new Random();С���ź������ռ���
 * 
 * 3.ʹ��
  *  ��ȡһ�������int����(��Χ��int���з�Χ������������) int num = r.nextInt(); 
  *  ��ȡһ�������int����(���������˷�Χ������ҿ�����) int num = r.nextInt(3); 
 * ʵ���ϴ���ĺ�����[0,3),Ҳ����0��2.
 * */

public class Day07DemoRandom {

public static void main(String[] args) {
	
	 Random r = new Random();
	 int num = r.nextInt(); 
	 System.out.println(r);
	   System.out.println("������ɵ�������" + num);
	
       System.out.println("_________________");
     for (int i = 0; i < 10; i++) {
        	 int num1 = r.nextInt(10); 
	   System.out.println("�������0-9��10������" +num1);
}

}

}
