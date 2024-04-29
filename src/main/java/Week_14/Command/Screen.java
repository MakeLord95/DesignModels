package Week_14.Command;

public class Screen {
    private boolean isRaised;

    public Screen() {
        isRaised = false;
    }

    public void goUp() {
        isRaised = true;
        System.out.println("Screen is raised");
    }

    public void goDown() {
        isRaised = false;
        System.out.println("Screen is lowered");
    }
}
