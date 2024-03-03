package Week_6.ChainOfResponsibility;

public class CEO implements Handler {
    @Override
    public void handleRequest(Employee employee) {
        if (employee.getPayRaisePercentage() > 5) {
            System.out.printf("CEO: Pay raise approved for %s.\n", employee.getName());
        } else {
            System.out.printf("CEO: Pay raise denied for %s.\n", employee.getName());
        }
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
    }
}
