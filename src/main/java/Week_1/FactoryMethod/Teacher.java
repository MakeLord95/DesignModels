package Week_1.FactoryMethod;

public class Teacher extends DiningCreature {

    public Drink createDrink() {
        return new Water();
    }

}
