package Week_4.Decorator;

public class PepperoniFilling extends Filling {
    public PepperoniFilling(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 3.5;
    }
}
