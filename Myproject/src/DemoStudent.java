
public class DemoStudent {

	public static void main(String[] args) {
		Student stu = new Student();
		stu.setName("张无忌");
		stu.setAge(20);
		System.out.println("我的名字是"+stu.getName()+"，年龄"+stu.getAge());
		
		System.out.println("---------------------------");
		
		
		Student stu2 = new Student("张三丰",100);
		System.out.println("我的名字是"+stu2.getName()+"，年龄"+stu2.getAge());
		stu2.setAge(101);
		System.out.println(stu2.getAge());
	}
	
	
	
}
