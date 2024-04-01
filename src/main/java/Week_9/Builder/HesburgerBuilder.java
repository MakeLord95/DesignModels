package Week_9.Builder;

import java.util.ArrayList;
import java.util.List;

public class HesburgerBuilder extends HamburgerBuilder {
    private final List<String> parts;

    public HesburgerBuilder() {
        this.parts = new ArrayList<>();
    }

    @Override
    public void addBun() {
        parts.add("Hesburger Bun");
    }

    @Override
    public void addPatty() {
        parts.add("Hesburger Patty");
    }

    @Override
    public void addCheese() {
        parts.add("Hesburger Cheese");
    }

    @Override
    public void addSauce() {
        parts.add("Hesburger Sauce");
    }

    @Override
    public void addVegetables() {
        parts.add("Hesburger Vegetables");
    }

    @Override
    public Hamburger getBurger() {
        return new Hamburger(parts);
    }
}
