package Week_9.Adapter;

public class Adapter implements ClientInterface {
    private final ExistingService existingService;

    public Adapter(ExistingService existingService) {
        this.existingService = existingService;
    }

    @Override
    public void request() {
        existingService.specificRequest();
    }
}
