/*�루���ң�&&
 *�򣨻��ߣ�||
 *�ǣ�ȡ����!
 * 
 * ��"&&" ��"||"�����ж�·Ч���������������Ѿ������жϵõ����ս�����Ǳ��ұߵĴ��뽫����ִ�У�
 * �Ӷ���ʡһ�������ܡ�
 * 
 * ע�����
 * 1.�߼����������������booleanֵ��
 * 2.�룬����Ҫ���Ҷ��в���ֵ������ȡ��ֻҪ��һ������ֵ���ɡ�
 * 3.������������������ж����������������д��
 * ��������������A &&����B
 * �������������A &&����B &&����C
 * 
 * TIPS:
 * ����1<X<3�������Ӧ�ò���������֣�Ȼ�������������������
 * int x=2
 * 1<x && x<3
 * 
 */
public class Demo08Logic {
	public static void main(String[] args) {
		System.out.println(true && true); // true&&true-->true
		System.out.println(true && false);// false
		
		System.out.println(5<6 && 7>5); //true
		System.out.println("================");
		
		System.out.println(true || false); //true
		System.out.println(false || false); //false
		System.out.println(true || true); //true
		System.out.println(7!=8 || 7>3); //true
		
		System.out.println("================");
		
		System.out.println(!true); // false
		System.out.println(!false); //true
		
	    int a=10;
	    System.out.println(3>4 && ++a<100); //false����Ϊ��ߵĴ�����Ϊfalse���ұߵĴ���Ҳ�Ͳ���ִ���ˡ�
	    System.out.println(a);// ��������ԭ�� aû��+1,��Ȼ��10��
	    
	    int b=20;
	    System.out.println(5<8 || ++b>10); //true
	    System.out.println(b);//��Ϊ����Ѿ�����֪�����н��Ϊtrue������ұߵĴ��벻��ִ�У�b��Ȼ��20��
	    
	    
		
		
	}

}