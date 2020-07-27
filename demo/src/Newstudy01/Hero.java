package Newstudy01;
/* 游戏当中英雄的角色类
 * */

public class Hero {
	private String name;//英雄的名字
	private int age;//英雄的年龄
	private Weapon weapon;//英雄的武器
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
		System.out.println("年龄为"+age+"の"+name+"使用"+weapon.getCode()+"来推塔了");

	}
	public void defend() {
		System.out.println("年龄为"+age+"の"+name+"使用"+weapon.getCode()+"来守塔了");
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
