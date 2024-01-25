package Week_2.AbstractFactory.Client;

import Week_2.AbstractFactory.Factories.ClothingFactory;
import Week_2.AbstractFactory.Models.Cap;
import Week_2.AbstractFactory.Models.Pants;
import Week_2.AbstractFactory.Models.Shoes;
import Week_2.AbstractFactory.Models.TShirt;

public class Jasper {
    private ClothingFactory factory;
    private Cap cap;
    private TShirt tShirt;
    private Pants pants;
    private Shoes shoes;

    public Jasper(ClothingFactory factory) {
        this.factory = factory;
    }

    public void setFactory(ClothingFactory factory) {
        this.factory = factory;
    }

    public void dressUp() {
        cap = factory.createCap();
        tShirt = factory.createTShirt();
        pants = factory.createPants();
        shoes = factory.createShoes();
    }

    public void displayOutfit() {
        System.out.println("Jasper is wearing:");
        System.out.println(cap);
        System.out.println(tShirt);
        System.out.println(pants);
        System.out.println(shoes);
    }
}
