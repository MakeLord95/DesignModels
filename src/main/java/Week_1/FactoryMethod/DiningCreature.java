package Week_1.FactoryMethod;

public abstract class DiningCreature {

    Drink drink = null;

    public abstract Drink createDrink();

    public void dine() {
        eat();
        drink();
    }

    public void eat() {
        System.out.println("The food tastes really good");
    }

    public void drink() {
        drink = createDrink();
        System.out.println(drink + " makes you feel invigorated after a meal");
    }
}
