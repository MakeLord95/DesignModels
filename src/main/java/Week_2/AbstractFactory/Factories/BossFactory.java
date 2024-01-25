package Week_2.AbstractFactory.Factories;

import Week_2.AbstractFactory.Models.Cap;
import Week_2.AbstractFactory.Models.Pants;
import Week_2.AbstractFactory.Models.Shoes;
import Week_2.AbstractFactory.Models.TShirt;
import Week_2.AbstractFactory.Products.Boss.BossCap;
import Week_2.AbstractFactory.Products.Boss.BossPants;
import Week_2.AbstractFactory.Products.Boss.BossShoes;
import Week_2.AbstractFactory.Products.Boss.BossTShirt;

public class BossFactory implements ClothingFactory {
    @Override
    public Cap createCap() {
        return new BossCap();
    }

    @Override
    public TShirt createTShirt() {
        return new BossTShirt();
    }

    @Override
    public Pants createPants() {
        return new BossPants();
    }

    @Override
    public Shoes createShoes() {
        return new BossShoes();
    }
}
