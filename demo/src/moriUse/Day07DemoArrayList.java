package moriUse;

import java.util.ArrayList;

/* ����ĳ��Ȳ����Է����ı䡣
  *  ����ArrayList�ĳ����ǿ�������仯�ġ�
 * 
  *  ����ArrayList��˵����һ��������<E>�����͡�
  *  ���ͣ�Ҳ����װ�ڼ��ϵ��е�����Ԫ�أ�ȫ����ͳһ��ʲô���͡�
  *  ע�⣻����ֻ�����������ͣ������ǻ������͡�
 * */

public class Day07DemoArrayList {
	public static void main(String[] args) {
		ArrayList <String> list = new ArrayList<>();
		//�򼯺ϵ������һЩ���ݣ���Ҫ�õ�add������
		list.add("����");//��������ַ�������int��100�Ͳ��С�
		list.add("����");
		System.out.println(list);
	} 
}
