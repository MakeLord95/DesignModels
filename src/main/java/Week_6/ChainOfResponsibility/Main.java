package Week_6.ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Handler immediateSupervisor = new ImmediateSupervisor();
        Handler unitManager = new UnitManager();
        Handler ceo = new CEO();

        immediateSupervisor.setNextHandler(unitManager);
        unitManager.setNextHandler(ceo);

        Employee employee1 = new Employee("Employee 1", 1.5);
        Employee employee2 = new Employee("Employee 2", 3.5);
        Employee employee3 = new Employee("Employee 3", 6.0);

        immediateSupervisor.handleRequest(employee1);
        immediateSupervisor.handleRequest(employee2);
        immediateSupervisor.handleRequest(employee3);
    }
}
