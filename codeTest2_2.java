package codetest;
import java.util.Scanner;

public class codeTest2_2 {

	    static int hero_level = 1;
	    static int hero_power = 15;
	    static int hero_defense = 25;
	    static int hero_hp = 80;
	    static int hero_mp = 0;
	    static int hero_experience = 0;
	    static int hero_money = 0;
	    static String hero_name;

	    static int monster_hp, monster_defense, monster_power, monster_mp, monster_level;
	    static int monster_experience, monster_money;
	    static String monster_name;

	    static Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        System.out.println("영용의 이름을 입력하세요. : ");
	        hero_name = scanner.nextLine();
	        System.out.println("이름이 입력되었습니다.");
	        System.out.println("게임에 입장하였습니다.");
	        
	        printHeroStatus();
	        
	        while (true) {
	            System.out.println("***********************");
	            System.out.println("1. 사낭터");
	            System.out.println("2. 포션 상점");
	            System.out.println("입장할 장소를 입력하세요. : ");
	            int location = scanner.nextInt();
	            
	            if (location == 1) {
	                enterDungeon();
	            } else if (location == 2) {
	                enterPotionShop();
	            } else {
	                System.out.println("잘못된 입력입니다.");
	            }
	        }
	    }

	    static void printHeroStatus() {
	        System.out.println("***********************");
	        System.out.println("현재 Hero 의 이름 : " + hero_name);
	        System.out.println("현재 " + hero_name + "의 레벨 : " + hero_level);
	        System.out.println("현재 " + hero_name + "의 힘 : " + hero_power);
	        System.out.println("현재 " + hero_name + "의 방어력 : " + hero_defense);
	        System.out.println("현재 " + hero_name + "의 HP : " + hero_hp);
	        System.out.println("현재 " + hero_name + "의 경험치 : " + hero_experience);
	        System.out.println("현재 " + hero_name + "의 돈 : " + hero_money + "원");
	        System.out.println("***********************");
	    }

	    static void enterDungeon() {
	        System.out.println("사낭터에 입장하였습니다.");
	        System.out.println("1. 너구리");
	        if (hero_level >= 2) {
	            System.out.println("2. 살쾡이");
	        }
	        System.out.println("전투할 상대를 입력하세요. : ");
	        
	        int monsterChoice = scanner.nextInt();
	        
	        if (monsterChoice == 1) {
	            setupMonster("너구리", 1, 10, 5, 50, 10, 10);
	        } else if (monsterChoice == 2 && hero_level >= 2) {
	            setupMonster("살쾡이", 5, 30, 20, 150, 50, 50);
	        } else {
	            System.out.println("잘못된 입력이거나 아직 이 몬스터와 싸울 수 없습니다.");
	            return;
	        }
	        
	        System.out.println(monster_name + "과 전투를 시작합니다.");
	        battle();
	    }

	    static void setupMonster(String name, int level, int power, int defense, int hp, int exp, int money) {
	        monster_name = name;
	        monster_level = level;
	        monster_power = power;
	        monster_defense = defense;
	        monster_hp = hp;
	        monster_experience = exp;
	        monster_money = money;
	    }

	    static void battle() {
	        while (true) {
	            System.out.println(hero_name + "의 공격입니다.");
	            int damage = hero_attack();
	            System.out.println(monster_name + " 대미지는 " + damage + " 입니다.");
	            monster_attacked(damage);
	            
	            if (monster_hp <= 0) {
	                System.out.println(monster_name + "가 죽었습니다.");
	                hero_experience += monster_experience;
	                hero_money += monster_money;
	                checkLevelUp();
	                printHeroStatus();
	                break;
	            }
	            
	            System.out.println(monster_name + "의 공격입니다.");
	            damage = monster_attack();
	            System.out.println(hero_name + " 대미지는 " + damage + " 입니다.");
	            hero_attacked(damage);
	            
	            if (hero_hp <= 0) {
	                System.out.println(hero_name + "가 죽었습니다.");
	                hero_hp = 1;
	                System.out.println(hero_name + "가 부활했습니다.");
	                printHeroStatus();
	                break;
	            }
	        }
	    }

	    static int hero_attack() {
	        return hero_level * 10 + hero_power * 30;
	    }

	    static void hero_attacked(int sum) {
	        if (hero_defense >= sum) {
	        } else {
	            hero_hp = hero_hp + hero_defense - sum;
	        }
	    }

	    static int monster_attack() {
	        return monster_power;
	    }

	    static void monster_attacked(int sum) {
	        if (monster_defense >= sum) {
	        } else {
	            monster_hp = monster_hp + monster_defense - sum;
	        }
	    }

	    static void checkLevelUp() {
	        if (hero_experience >= hero_level * 80) {
	            hero_level++;
	            System.out.println(hero_name + "의 레벨이 " + hero_level + "이 되었습니다.");
	            hero_money += hero_level * 50;
	            System.out.println("레벨업 기념으로 돈이 " + (hero_level * 50) + "원 증가하여");
	            System.out.println(hero_money + "원이 되었습니다.");
	            hero_experience = 0;
	        }
	    }

	    static void enterPotionShop() {
	        System.out.println("포션 상점에 입장하였습니다.");
	        System.out.println("보유 금액: " + hero_money + "원");
	        System.out.println("1. 힘 증가 포션 (3원)");
	        System.out.println("2. 방어력 증가 포션 (3원)");
	        System.out.println("3. HP 증가 포션 (3원)");
	        System.out.println("4. 경험치 증가 포션 (3원)");
	        System.out.println("5. MP 증가 포션 (3원)");
	        System.out.println("6. 상점 나가기");
	        System.out.println("구매할 포션을 선택하세요: ");
	        
	        int choice = scanner.nextInt();
	        
	        if (choice == 6) return;
	        
	        if (hero_money < 3) {
	            System.out.println("돈이 부족합니다.");
	            return;
	        }
	        
	        switch (choice) {
	            case 1:
	                hero_power += 3;
	                break;
	            case 2:
	                hero_defense += 3;
	                break;
	            case 3:
	                hero_hp += 50;
	                break;
	            case 4:
	                hero_experience += 50;
	                break;
	            case 5:
	                hero_mp += 50;
	                break;
	            default:
	                System.out.println("잘못된 선택입니다.");
	                return;
	        }
	        
	        hero_money -= 3;
	        System.out.println("포션을 구매했습니다.");
	        printHeroStatus();
	    }
	}