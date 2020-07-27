package Newstudy01;
/* ��Ϸ����Ӣ�۵Ľ�ɫ��
 * */

public class Hero {
	private String name;//Ӣ�۵�����
	private int age;//Ӣ�۵�����
	private Weapon weapon;//Ӣ�۵�����
	private Skill skill;
	
	public Skill getSkill() {
		return skill;
	}
	public Hero(String name, int age, Weapon weapon, Skill skill) {
		super();
		this.name = name;
		this.age = age;
		this.weapon = weapon;
		this.skill = skill;
	}
	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	public void attack() {
		System.out.println("����Ϊ"+age+"��"+name+"ʹ��"+weapon.getCode()+"��������");

	}
	public void defend() {
		System.out.println("����Ϊ"+age+"��"+name+"ʹ��"+weapon.getCode()+"��������");
		skill.use();
	}
	
	public Hero() {
		super();
		
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
	public Weapon getWeapon() {
		return weapon;
	}
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}


	
}