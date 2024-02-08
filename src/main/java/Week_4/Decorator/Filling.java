package Week_4.Decorator;

public abstract class Filling implements Pizza {
    protected Pizza pizza;

    public Filling(Pizza pizza) {
        this.pizza = pizza;
    }
}
