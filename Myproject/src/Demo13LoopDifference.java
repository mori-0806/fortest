/*����ѭ��������
 * 1.��������жϴ���û�����������ôforѭ����whileѭ������ִ��0��
 * ����do-whileѭ����ִ������һ�Ρ�
 * 2.forѭ���ı�����С���ŵ��ж��壬ֻ��ѭ���ڲ��ſ���ʹ�á�
 * whileѭ����do-whileѭ����ʼ�����������棬���Գ���ѭ��֮�󻹿���ʹ�á�
 *   
 */
public class Demo13LoopDifference {
	public static void main (String[] args) {
		
		for (int i=1; i<0; i++) {
			System.out.println("hello");
		}
		//System.out.println(i);//��һ���Ǵ���д������Ϊ����i������forѭ��С�����ڣ�ֻ��forѭ���Լ������á�
		
		System.out.println("=============================");
		
		int i=1;
		do {
			System.out.println("hello");
			i++;
			
		} while (i<0);
		
		//�����Ѿ�������do-whileѭ���ķ�Χ��������Ȼ����ʹ�ñ���i
		System.out.println(i); // result is 2������һ��i++ִ���Ժ��Ѿ�����Ϊ2�����Ի���2.
		
		
	}

}
