package moriUse;
import java.util.Scanner;//1.����
/*
 * scanner ��Ĺ��ܣ�����ʵ�ּ����������ݵ������С�
 * 
  * �������͵�һ��ʹ�ò���
 *  
 * 1.����
 * import ��·��.������
  *   ���ʹ�õ�Ŀ����͵�ǰ��λ��ͬһ�����£������ʡ�Ե�����䲻д
  *   ֻ��java.lang���µ����ݲ���Ҫ�����������İ�����Ҫimport���
 * 
 * 2.����
  *   ������ ������ = new ������();
 * 
 * 3.ʹ��
  *   ������.��Ա������
 * 
 * 
 * */

public class Day07DemoScanner {

public static void main(String[] args) {
	//2.����
	//��ע��System.in����Ӽ�������

	Scanner sc = new Scanner(System.in);
	//3.ʹ��
	//��ȡ���������һ��int���֣�int num = sc.nextInt();
	//��ȡ����������ַ�����        String str = sc.next();
	int num = sc.nextInt();
	System.out.println("�����int������" + num);
	
	String str = sc.next();
	System.out.println("������ַ�����"+ str);
}

}

