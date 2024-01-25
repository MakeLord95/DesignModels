package Week_2.AbstractFactory.Factories;

import Week_2.AbstractFactory.Models.Cap;
import Week_2.AbstractFactory.Models.Pants;
import Week_2.AbstractFactory.Models.Shoes;
import Week_2.AbstractFactory.Models.TShirt;
import Week_2.AbstractFactory.Products.Adidas.AdidasCap;
import Week_2.AbstractFactory.Products.Adidas.AdidasPants;
import Week_2.AbstractFactory.Products.Adidas.AdidasShoes;
import Week_2.AbstractFactory.Products.Adidas.AdidasTShirt;

public class AdidasFactory implements ClothingFactory {
    @Override
    public Cap createCap() {
        return new AdidasCap();
    }

    @Override
    public TShirt createTShirt() {
        return new AdidasTShirt();
    }

    @Override
    public Pants createPants() {
        return new AdidasPants();
    }

    @Override
    public Shoes createShoes() {
        return new AdidasShoes();
    }
}
