
public class Student {

/*
 一个标准的类通常要有四个组成部分；
 1.所有的成员变量都要使用private关键字修饰
 2.为每一个成员变量编写一对getter/setter方法 //（Alt+shift+s +r）
 3.编写一个无参数的构造方法  // alt+shift+s +c
 4.编写一个全参数的构造方法  //alt+shift+s +o
 */

	private String name;//名字
	private int age;//年龄
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
