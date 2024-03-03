package Week_6.ChainOfResponsibility;

public class UnitManager implements Handler {
    private Handler nextHandler;

    @Override
    public void handleRequest(Employee employee) {
        if (employee.getPayRaisePercentage() > 2 && employee.getPayRaisePercentage() <= 5) {
            System.out.printf("Unit Manager: Pay raise approved for %s.\n", employee.getName());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(employee);
        }
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
