
public class DemoStudent {

	public static void main(String[] args) {
		Student stu = new Student();
		stu.setName("���޼�");
		stu.setAge(20);
		System.out.println("�ҵ�������"+stu.getName()+"������"+stu.getAge());
		
		System.out.println("---------------------------");
		
		
		Student stu2 = new Student("������",100);
		System.out.println("�ҵ�������"+stu2.getName()+"������"+stu2.getAge());
		stu2.setAge(101);
		System.out.println(stu2.getAge());
	}
	
	
	
}
