package codetest;

import java.util.Scanner;

class Hero {
    String name;
    int level, power, hp, defense, mp, experience, money;

    Hero(String name) {
        this.name = name;
        this.level = 1;
        this.power = 10;
        this.hp = 100;
        this.defense = 5;
        this.mp = 50;
        this.experience = 0;
        this.money = 0;
    }

    void attack(Monster monster) {
        int damage = level * 10 + power * 30;
        if (monster.defense < damage) {
            monster.hp -= (damage - monster.defense);
        }
        System.out.println(name + " атакует " + monster.name + "! Осталось HP у монстра: " + monster.hp);
    }

    void receiveDamage(int damage) {
        if (defense < damage) {
            hp -= (damage - defense);
        }
        if (hp <= 0) {
            System.out.println(name + " погиб...");
        }
    }

    void levelUp() {
        if (experience >= level * 80) {
            experience = 0;
            level++;
            money += level * 50;
            System.out.println("Поздравляем! " + name + " повысил уровень до " + level + "!");
        }
    }
}

class Monster {
    String name;
    int level, power, hp, defense, experience, money;

    Monster(String name, int level, int power, int hp, int defense, int experience, int money) {
        this.name = name;
        this.level = level;
        this.power = power;
        this.hp = hp;
        this.defense = defense;
        this.experience = experience;
        this.money = money;
    }

    void attack(Hero hero) {
        if (hero.defense < power) {
            hero.hp -= (power - hero.defense);
        }
        System.out.println(name + " атакует " + hero.name + "! Осталось HP у героя: " + hero.hp);
    }
}

public class rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("영웅의 이름을 입력하세요: ");
        String heroName = in.next();
        Hero hero = new Hero(heroName);

        Monster monster1 = new Monster("너구리", 1, 20, 100, 5, 10, 10);
        Monster monster2 = new Monster("갈쾡이", 5, 100, 2000, 20, 50, 30);

        while (hero.hp > 0) {
            System.out.println("\n1. 사냥터");
            if (hero.level >= 2) {
                System.out.println("2. 포션 상점");
            }
            System.out.print("입장할 장소를 입력하세요: ");
            int location = in.nextInt();

            if (location == 1) {
                if (hero.level >= 2) {
                    System.out.println(hero.name + " vs " + monster2.name);
                    hero.attack(monster2);
                    monster2.attack(hero);
                    hero.experience += monster2.experience;
                } else {
                    System.out.println(hero.name + " vs " + monster1.name);
                    hero.attack(monster1);
                    monster1.attack(hero);
                    hero.experience += monster1.experience;
                }
                hero.levelUp();
            } else if (location == 2 && hero.level >= 2) {
                System.out.println("Добро пожаловать в магазин. У вас " + hero.money + " монет. Зелье стоит 20 монет. Купить? (1 - да, 2 - нет)");
                int choice = in.nextInt();
                if (choice == 1 && hero.money >= 20) {
                    hero.hp += 50;
                    hero.money -= 20;
                    System.out.println("Вы купили зелье! Теперь ваше HP: " + hero.hp);
                } else {
                    System.out.println("Недостаточно денег или отмена покупки.");
                }
            }
        }
        System.out.println("Игра окончена.");
    }
}
