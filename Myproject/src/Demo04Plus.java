/*�������е��еġ�+���г����������÷���
 * 1.��ֵ�ļӷ�����
 * 2.�����ַ�char������˵���ڼ���֮ǰ�ᱻ�Զ�����Ϊint�࣬�ټ��㣬����A+1=65
 * 3.�����ַ���String������ĸ��д�������ǹؼ��֣���˵����+�������ַ������Ӳ�����
 * ����hello+world��
 * �κ��������ͺ�String�ַ������ӵ�ʱ�򣬽���������ַ�����
 * 
 */


public class Demo04Plus {
	public static void main(String[] args) {
		//�ַ������͵ı�������ʹ��
		//��������string ��������=����ֵ
		System.out.println("hello");
		
		//�ַ���String�üӺ������÷�
		System.out.println("hello"+"kana");
		
		//String����+int�����÷�
		//String+int--->String
		
		String str1="Mad world";
		System.out.println(str1+2020);
		
		//���ȼ�����
		//String+int+int
		//String +int
		//String
		
		System.out.println(str1+20+30);//���н����Ȼ��string���ͣ�Mad world2030
		//�����Ҫ��string���͵�����н������㣬��Ҫ�����㹫ʽ��С����������
		System.out.println(str1+(20+30));
		

		
		
	}

}
