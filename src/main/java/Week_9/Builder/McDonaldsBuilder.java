package Week_9.Builder;

import java.util.Collections;

public class McDonaldsBuilder extends HamburgerBuilder {
    private final StringBuilder burger;

    public McDonaldsBuilder() {
        this.burger = new StringBuilder();
    }

    @Override
    public void addBun() {
        burger.append("McDonald's Bun\n");
    }

    @Override
    public void addPatty() {
        burger.append("McDonald's Patty\n");
    }

    @Override
    public void addCheese() {
        burger.append("McDonald's Cheese\n");
    }

    @Override
    public void addSauce() {
        burger.append("McDonald's Sauce\n");
    }

    @Override
    public void addVegetables() {
        burger.append("McDonald's Vegetables\n");
    }

    @Override
    public Hamburger getBurger() {
        return new Hamburger(Collections.singletonList(burger.toString()));
    }
}
