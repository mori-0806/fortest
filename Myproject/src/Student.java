
public class Student {

/*
 һ����׼����ͨ��Ҫ���ĸ���ɲ��֣�
 1.���еĳ�Ա������Ҫʹ��private�ؼ�������
 2.Ϊÿһ����Ա������дһ��getter/setter���� //��Alt+shift+s +r��
 3.��дһ���޲����Ĺ��췽��  // alt+shift+s +c
 4.��дһ��ȫ�����Ĺ��췽��  //alt+shift+s +o
 */

	private String name;//����
	private int age;//����
	
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
