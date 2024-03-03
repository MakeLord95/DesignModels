package Week_6.ChainOfResponsibility;

public interface Handler {
    void handleRequest(Employee employee);

    void setNextHandler(Handler successor);
}
