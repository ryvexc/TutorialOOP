package _15_AbstractClass;

abstract class BluePrintHero {
    String heroName;

    void showHeroName() {}

    String getHeroName() {
        return this.heroName;
    }
}

class Hero extends BluePrintHero {
    public Hero(String heroName) {
        super.heroName = heroName;
    }

    void showHeroName() {
        System.out.println(super.heroName);
    }
}

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("Ktl");
        hero.showHeroName();
        String name = hero.getHeroName();
        System.out.println("String nama = "+name);
    }
}
