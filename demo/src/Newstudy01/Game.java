package Newstudy01;

public class Game  {

	public static void main(String[] args) {
		//创建一个英雄角色
		Hero hero = new Hero();
		
		hero.setName("剑圣");
		hero.setAge(18);
		
		//创建武器
		Weapon wp =new Weapon("剑圣风暴");
		hero.setWeapon(wp);
		hero.attack();
		System.out.println("---------------------");
		
		Weapon wp1 =new Weapon("两个大砍刀");
	
				
		Hero hero1 = new Hero("敌法师", 20,wp1,new Skillimp());
		hero1.setWeapon(wp1);
		hero1.setSkill(new Skillimp());
		hero1.defend();
		
	}
}
