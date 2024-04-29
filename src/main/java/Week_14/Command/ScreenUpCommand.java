package Week_14.Command;

public class ScreenUpCommand implements Command {
    private final Screen screen;

    public ScreenUpCommand(Screen screen) {
        this.screen = screen;
    }

    @Override
    public void execute() {
        screen.goUp();
    }
}
