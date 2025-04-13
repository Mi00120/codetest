package codetest;
import java.util.Scanner;

public class game {
	static int hero_level, hero_power, hero_hp, hero_defence, hero_mp, hero_experience, hero_money;
	static int monster_hp, monster_defense, monster_power, monster_mp, monster_level, monster_experience, monster_money;
	static String hero_name, monster_name;
	
class Hero{
	String hero_name;
	int hero_level;
	int hero_power;
	int hero_hp;
	int hero_defense;
	int hero_mp;
	int hero_experience;
	int hero_money;
	
	Hero(String hero_name, int hero_level, int hero_power, int hero_hp, int hero_defense, int hero_mp, int hero_experience, int hero_money){
		this.hero_name=heroName;
		this.hero_level=1;
		this.hero_power=10;
		this.hero_hp=100;
		this.hero_defense=5;
		this.hero_mp=50;
		this.hero_experience=0;
		this.hero_money=0;
	}
	int attack(Monster monster) {
		int damage=hero_level*10+hero_power*30;
		if (monster_defense>=damage) {
			return monster_hp;
		}
		else {
			monster_hp-=damage-monster_defense;
			return monster_hp;
			}
		}
	int receivedDamage(int damage) {
		if (hero_defense>=damage) {
			return hero_hp-=(damage-hero_defense);
		}
		if (hero_hp<=0) {
			System.out.println(hero_name+"죽었음");
		}
		
		}
	}
class Monster{
	String monster_name;
	int monster_level;
	int monster_power;
	int monster_hp;
	int monster_defense;
	int monster_mp;
	int monster_experience;
	int monster_money;
	
	


	public void attack(Monster monster) {
		int damage=this.hero_power-
		
		
		
		
	}
}


	
	public static void main(String[] args) {
		Her
		
		Scanner in=new Scanner(System.in);
		System.out.println("영웅의 이름을 입력하세요: ");
		hero_name=in.next();
		System.out.println("이름을 입력되었씁니다.");
		System.out.println("게임에 입장 하였습니다.");
		System.out.println("***********************");
		System.out.println("현재 Hero의 이름: "+hero_name);
		System.out.println("현재 "+hero_name+"의 레벨: "+hero_level);
		System.out.println("현재 "+hero_name+"의 힘: "+hero_power);
		System.out.println("현재 "+hero_name+"의 방어력: "+hero_defence);
		System.out.println("현재 "+hero_name+"의 HP: "+hero_mp);
		System.out.println("현재 "+hero_name+"의 경험"+hero_experience);
		System.out.println("현재 "+hero_name+"의 돈"+hero_money+"원");
		System.out.println("***********************");
		
		System.out.println("1.사냥터");
		if hero_level=2:
			System.out.println("2.포션 상점");
		System.out.println("입장할 장소를 입력하세요: ");
		location=in.nextInt();
		switch(location) {
		case 1-> ""
	
		
				
		
		
		if hero_experience>=hero_level*80{
			hero_level+=1;
			System.out.println("레벨업! 지금 레벨:"+hero_level);
			hero_experience=0;
			int money_plus=hero_level*50;
			hero_money+=money_plus;
			System.out.println("레벨업 기념으로 돈이 "+money_plus+"원 증가하여 "+hero_money+"원이 되었습니다!");
		}
	}
	static int hero_atack() {
		//hero attack, monster defense
		monster_damage=hero_level*10+hero_power*30;
		if monster_defense>=monster_damage:
			monster_hp;
		else:
			monster_hp=monster_hp+ monster_defense-sum;
	}
	
	static void hero_attacked() {
		//hero died
		if hero_hp<=0:
			System.out.println("Hero died");
		break
	}
	
	static int monster_attack() {
		//monster attack, hero defense
		if hero_defence>=monster_power:
			hero_hp==hero_hp
		else:
			hero_hp=hero_hp+hero_defense-monster_power;
	}
	
	static void monster_attacked(int sum) {
		//monster died
		hero_experience+=monster_experience;
		hero_money+=monster_money;
		break
	}
	}
//monster stats
monster_name="너구리";
monster_hp=100;
monster_mp=0;
monster_level=1;
monster_power=20;
monster_defense=5;
monster_money=10;
monster_experience=10;

monster_name="갈쾡이";
monster_hp=2000;
monster_mp=0;
monster_level=5;
monster_power=100;
monster_defense=20;
monster_money=30;
monster_experience=50;

}
