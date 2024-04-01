package Week_9.Builder;

public abstract class HamburgerBuilder {
    public abstract void addBun();

    public abstract void addPatty();

    public abstract void addCheese();

    public abstract void addSauce();

    public abstract void addVegetables();

    public abstract Hamburger getBurger();
}
