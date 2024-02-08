package Week_4.Decorator;

public class MushroomFilling extends Filling {
    public MushroomFilling(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 2.5;
    }
}
