/* �����������++
 * �Լ��������--
 * 
 * �������壺��һ��������һ������1��һ������1
 * ʹ�ø�ʽ��д�ڱ�������֮ǰ����֮�󶼿��ԣ����磺++num��num++
 * ʹ�÷�ʽ��
 * 1.����ʹ�ã���������������ϣ�����Ϊһ�����裬����++num��
 * 2.���ʹ�ã�������������ϣ������븳ֵ���ߺʹ�ӡ������ϵȡ�
 * 
 * ʹ������
 * 1.����ʹ��ʱ��++num��num++û������
 * 2.���ʹ��ʱ���С��ش�����
 * A.����ǡ�ǰ++���������᡾����+1����Ȼ�����Ž������ʹ�á������ȼӺ��á�
 * B.����ǡ���++�������Ȼ�ʹ�ñ����������ֵ��Ȼ�������+1�����ú�ӡ�
 * 
 * ע�����
 * ֻ�б�������ʹ���������Լ���������������ɷ����ı䣬���Բ����ã�����30++��
 */
public class Demo05Operator {
	public static void main(String[] args) {
		
		int num1=10;
		System.out.println(num1);
		num1++;
		System.out.println(num1);//11,����������1
		++num1;
		System.out.println(num1);//2��++num��num++û������
		System.out.println("=================");
		
		//���ʹ��ʱ��ǰ++�ľ���˵��
		int num2=20;
		System.out.println(++num2);//��������+1�������21 
		System.out.println(num2);//21
		System.out.println(++num2);//����һ���������Ļ�����+1�������22
		System.out.println(++num2);//����һ���������Ļ�����+1�������23
		
		//���ʹ��ʱ����++�ľ���˵��
		int num3=30;
		System.out.println(num3++);//���ñ����������ֵ��Ȼ����+1�����ú�ӡ�,result is 30
		System.out.println(num3);//����+1��31
		
		System.out.println(num3++);//����������Ļ����ϣ����ú�ӣ������31
		System.out.println(num3);//result is 32
		
		System.out.println("=================");
		
		//��ǰ--���븳ֵ�Ļ�ϲ���
		int num4=40;
		int result=--num4;
		System.out.println(result);//���ʹ�á�ǰ--������������-1�����39����result������
		System.out.println(num4);//�ȼ����õ�ԭ�����num4�Ľ��Ҳ��result������ͬ����39
		System.out.println(--num4);//���������н���Ļ�����-1.
		
		
		//����--���븳ֵ�Ļ�ϲ���
		int num5=50;
		int result1=num5--;
		System.out.println(result1);//���ú����ԭ���Ȱѱ�����50����result1�������50
		System.out.println(num5);//�Ȱѱ�����50����result1����-1�������49
		
		int x=30, y=40;
		int result2=++x+y--; //ֻ��ѧϰ�ο���ʵ�ʿ���ʱ������������ôд��������׶�Խ�á�
		
		System.out.println(result2); // 31+40=71
		System.out.println(x); //x+1=31
		System.out.println(y); //y-1=39
		
		
		
		
	}

}
