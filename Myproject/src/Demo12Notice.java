/*�ڸ��������и�ֵʱ������Ҳ�ı��ʽ����ȫ���ǳ�����û���κα�����
 * ��ô������javac����ֱ�ӽ����ɸ��������ʽ����õ������
 * short result=5+8��//�Ⱥ��ұ�ȫ���ǳ�����û���κα����������㣬
 * ����֮�󣬵õ���.class�ֽ��뵱���൱�ڡ�ֱ�Ӿ��ǡ���short result=13��
 * ���Ϊ���������ĳ����Ż�����
 * 
 * ����ע�⣺һ�����ʽ�����б������룬��ô�Ͳ��ܽ��������Ż��ˡ�����short result2=5+a+8;
 *  
 * 
 * 
 */
public class Demo12Notice {
	public static void main(String[] args) {
		short num1=10; //��ȷд�����Ҳ�û�г������ķ�Χ
		
		System.out.println(num1);
		
		short a=5; //int
		short b=8; //int
		// short+short-->int+int-->int
		//short result=a+b; // ����д���������Ҫ��int����
		
		//�Ҳ಻�ñ��������ǲ��ó���������ֻ������������û������
		short result=5+8;
		System.out.println(result);
		
		//����д�� short result2=5+a+8; //
		
	}

}
