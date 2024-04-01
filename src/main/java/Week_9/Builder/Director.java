package Week_9.Builder;

public class Director {
    private HamburgerBuilder builder;

    public void setBuilder(HamburgerBuilder builder) {
        this.builder = builder;
    }

    public void constructBurger() {
        builder.addBun();
        builder.addSauce();
        builder.addCheese();
        builder.addPatty();
        builder.addVegetables();
        builder.addBun();
    }

    public Hamburger getBurger() {
        return builder.getBurger();
    }
}
