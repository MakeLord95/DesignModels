package Week_4.Decorator;

public class CheeseFilling extends Filling {
    public CheeseFilling(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 1.25;
    }
}
