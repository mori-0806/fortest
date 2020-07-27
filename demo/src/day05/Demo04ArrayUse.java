package day05;

/*
  * 直接打印数组名称，得到的是数组对应的，内存地址哈希值。
 *
  *访问数组元素的格式，数组名称{索引值}
  * 索引值，就是一个int数字，代表数组当中元素的编号。
  *【注意】索引从0开始，一直到数组的长度-1为止。
 * 
 */


public class Demo04ArrayUse {
	
	public static void main(String[] args) {
		//静态初始化的省略格式
		int[] array = {10,20,30};
		System.out.println(array);//得到的是内存地址哈希值[I@15db9742
		
		//直接打印数组中的元素
		System.out.println(array[0]);//0号元素值 10
		System.out.println(array[1]);//1号元素值 20
		System.out.println(array[2]);//2号元素值 30
		System.out.println("----------------------");
		
		//也可以将数组当中的某一个单个元素，赋值交给变量
		int num =array[1];
		System.out.println(num);//num的值为数组1号元素值 20
		
	}
	

}
