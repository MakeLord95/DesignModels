package Week_9.Adapter;

public class Main {
    public static void main(String[] args) {
        // Using normal interface
        ClientInterface client1 = new NormInterfaceImpl();
        client1.request();

        // Using adapter interface
        ExistingService service = new ExistingService();
        ClientInterface client2 = new Adapter(service);
        client2.request();
    }
}
