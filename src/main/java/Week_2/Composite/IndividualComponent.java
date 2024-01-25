package Week_2.Composite;

public class IndividualComponent implements Component {
    private final String name;
    private final double price;

    public IndividualComponent(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name;
    }
}
