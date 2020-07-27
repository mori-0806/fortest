package day0715;

import java.util.ArrayList;
import java.util.Iterator;

public class demo01 {

	public static void main(String[] args) {
		show01();
		
	}
	public static void show01() {
		ArrayList list = new ArrayList();
		list.add(777);
		list.add("eee");
		
		for (Object object : list) {
			System.out.println(object);
		}
//		Iterator it = list.iterator();
		
		System.out.println("重地".hashCode());
		System.out.println("通话".hashCode());
	}
}
