package Week_2.AbstractFactory;

import Week_2.AbstractFactory.Client.Jasper;
import Week_2.AbstractFactory.Factories.AdidasFactory;
import Week_2.AbstractFactory.Factories.BossFactory;
import Week_2.AbstractFactory.Factories.ClothingFactory;

public class Main {
    public static void main(String[] args) {
        ClothingFactory adidasFactory = new AdidasFactory();
        Jasper jasper = new Jasper(adidasFactory);

        jasper.dressUp();
        jasper.displayOutfit();

        System.out.println("Jasper is graduating and needs a new outfit!");

        ClothingFactory bossFactory = new BossFactory();
        jasper.setFactory(bossFactory);

        jasper.dressUp();
        jasper.displayOutfit();
    }
}
