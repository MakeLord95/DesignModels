package Week_2.Composite;

public class CompositeComponent implements Component {
    private final String name;
    private final Component[] components;
    private double price;

    public CompositeComponent(String name, double price, Component... components) {
        this.name = name;
        this.price = price;
        this.components = components;
    }

    public double getPrice() {

        for (Component component : components) {
            price += component.getPrice();
        }

        return price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(name).append(":\n");

        for (Component component : components) {
            sb.append("\t").append(component.toString().replace("\n", "\n\t")).append("\n");
        }

        return sb.toString();
    }
}
