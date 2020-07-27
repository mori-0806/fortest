package moriUse;

import java.util.ArrayList;

/* 数组的长度不可以发生改变。
  *  但是ArrayList的长度是可以随意变化的。
 * 
  *  对于ArrayList来说，有一个尖括号<E>代表泛型。
  *  泛型；也就是装在集合当中的所有元素，全都是统一的什么类型。
  *  注意；泛型只能是引用类型，不能是基本类型。
 * */

public class Day07DemoArrayList {
	public static void main(String[] args) {
		ArrayList <String> list = new ArrayList<>();
		//向集合当中添加一些数据，需要用到add方法。
		list.add("张三");//必须添加字符串，如int型100就不行。
		list.add("李四");
		System.out.println(list);
	} 
}
