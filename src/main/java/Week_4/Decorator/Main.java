package Week_4.Decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new PepperoniFilling(new PizzaBase());
        Pizza pizza2 = new MushroomFilling(new CheeseFilling(new PizzaBase()));
        Pizza pizza3 = new MushroomFilling(new PepperoniFilling(new CheeseFilling(new PizzaBase())));

        System.out.printf("Pizza 1: %s\n", pizza1.getPrice());
        System.out.printf("Pizza 2: %s\n", pizza2.getPrice());
        System.out.printf("Pizza 3: %s\n", pizza3.getPrice());
    }
}
