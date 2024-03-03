package Week_6.ChainOfResponsibility;

public class Employee {
    private final String name;
    private final double payRaisePercentage;

    public Employee(String name, double payRaisePercentage) {
        this.name = name;
        this.payRaisePercentage = payRaisePercentage;
    }

    public String getName() {
        return name;
    }

    public double getPayRaisePercentage() {
        return payRaisePercentage;
    }
}
