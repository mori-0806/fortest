package extend;

/*����������д��ע������
 * 1.���뱣֤������֮��ķ�����������ͬ�������б�Ҳ��ͬ
 * @override��д�ڷ�����ǰ�棬��������ǲ�����Ч����ȷ������д
  * ���㲻дֻҪ����Ҳ��
 *
 * 2.����ķ���ֵ���롾С�ڵ��ڡ�����ķ���ֵ���ͷ�Χ
  * С��ʾ��չ��java.lang.Object������������
 * 
 * 3.���෽����Ȩ�ޱ��롾���ڵ��ڡ����෽����Ȩ�����η�
 *С��ʾ��չ��public> protected > (default) > private 
  * ��ע;default���ǹؼ���default������ʲô����д������
 * 
 * */

public class OverRide {
public static void main(String[] args) {
	Fu fu = new Fu();
	fu.call();
	fu.sendmsg();
	fu.show();
	
	System.out.println("-------------------");
	
	Zi zi = new Zi();	
    zi.call();
    zi.sendmsg();
    zi.show();
    zi.net();

}
	
}
