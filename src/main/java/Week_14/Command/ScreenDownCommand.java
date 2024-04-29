package Week_14.Command;

public class ScreenDownCommand implements Command {
    private final Screen screen;

    public ScreenDownCommand(Screen screen) {
        this.screen = screen;
    }

    @Override
    public void execute() {
        screen.goDown();
    }
}
