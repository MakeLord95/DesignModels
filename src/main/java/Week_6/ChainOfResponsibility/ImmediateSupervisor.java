package Week_6.ChainOfResponsibility;

public class ImmediateSupervisor implements Handler {
    private Handler nextHandler;

    @Override
    public void handleRequest(Employee employee) {
        if (employee.getPayRaisePercentage() <= 2) {
            System.out.printf("Immediate Supervisor: Pay raise approved for %s.\n", employee.getName());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(employee);
        }
    }

    @Override
    public void setNextHandler(Handler successor) {
        this.nextHandler = successor;
    }
}
