/*���巽����������ʽ��
 * ���η� ����ֵ���� �������ƣ��������� �������ƣ���������{
 * ������
 * return ����ֵ��
 * }
 * 
 * ���η����ֽ׶εĹ̶�д����public static
 * ����ֵ���ͣ�Ҳ���Ƿ������ղ��������ݽ����ʲô����
 * �������ƣ����������֣�����ͱ���һ����С�շ�
 * �������ͣ����뷽����������ʲô����
 * �������ƣ����뷽�������ݶ��ڵı�������
 * ps����������ж����ʹ�ö��Ž��зָ�
 * �����壺������Ҫ�������飬�����д���
 * return���������ã���һ��ֹͣ��ǰ�������ڶ��Ǻ���ķ���ֵ�������ô�
 * ����ֵ��Ҳ���Ƿ���ִ�к����յ����ݽ��
 * 
 * ע�⣺return����ġ�����ֵ��������ͷ�������ǰ��ġ�����ֵ���͡������ֶ�Ӧ��
 * 
 */
public class Demo10While {
 public static void main(String[] args) {
  //��������
  sum(10,20);
  minus(30, 40);
  
  System.out.println("===================");
  
  //��ӡ����
  System.out.println(sum(10,20));
  
  //��ֵ����
  int number = sum(50,20);
        System.out.println(number);
        
        int x = minus(44,11);
        System.out.println(x);
  
  
 }
 
 public static int sum(int a,int b) {
  System.out.println("sum����ִ����");
  int result=a+b;  System.out.println("sum����ִ����");
  return result; //����ֵ����������Ҫ�ͷ�������ǰ����������ͱ���һ�¡�

  
 }
 
 public static int minus(int a,int b) { //public static�����η�
  System.out.println("minus����ִ����");
  int result = a-b; //������
  return result;
 }
 

}