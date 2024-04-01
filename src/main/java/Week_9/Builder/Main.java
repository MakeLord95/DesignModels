package Week_9.Builder;

public class Main {
    public static void main(String[] args) {
        HamburgerBuilder hesburgerBuilder = new HesburgerBuilder();
        HamburgerBuilder mcdonaldsBuilder = new McDonaldsBuilder();

        Director director = new Director();

        // Build a Hesburger with one algorithm
        director.setBuilder(hesburgerBuilder);
        director.constructBurger();
        Hamburger hesburger = director.getBurger();
        System.out.println("Hesburger Burger:");
        System.out.println(hesburger);

        // Build a McDonald's burger with another algorithm
        director.setBuilder(mcdonaldsBuilder);
        director.constructBurger();
        Hamburger mcdonalds = director.getBurger();
        System.out.println("McDonald's Burger:");
        System.out.println(mcdonalds);
    }
}
