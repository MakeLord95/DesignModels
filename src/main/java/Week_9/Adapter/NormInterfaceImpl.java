package Week_9.Adapter;

public class NormInterfaceImpl implements ClientInterface {
    @Override
    public void request() {
        System.out.println("Making a request via normal interface...");
    }
}
