package Week_2.AbstractFactory.Factories;

import Week_2.AbstractFactory.Models.Cap;
import Week_2.AbstractFactory.Models.Pants;
import Week_2.AbstractFactory.Models.Shoes;
import Week_2.AbstractFactory.Models.TShirt;

public interface ClothingFactory {

    Cap createCap();

    TShirt createTShirt();

    Pants createPants();

    Shoes createShoes();
}
