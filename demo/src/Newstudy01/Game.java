package Newstudy01;

public class Game  {

	public static void main(String[] args) {
		//����һ��Ӣ�۽�ɫ
		Hero hero = new Hero();
		
		hero.setName("��ʥ");
		hero.setAge(18);
		
		//��������
		Weapon wp =new Weapon("��ʥ�籩");
		hero.setWeapon(wp);
		hero.attack();
		System.out.println("---------------------");
		
		Weapon wp1 =new Weapon("�����󿳵�");
	
				
		Hero hero1 = new Hero("�з�ʦ", 20,wp1,new Skillimp());
		hero1.setWeapon(wp1);
		hero1.setSkill(new Skillimp());
		hero1.defend();
		
	}
}