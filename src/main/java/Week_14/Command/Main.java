package Week_14.Command;

public class Main {
    public static void main(String[] args) {
        Screen screen = new Screen();
        Command raiseScreen = new ScreenUpCommand(screen);
        Command lowerScreen = new ScreenDownCommand(screen);
        WallButton button1 = new WallButton(raiseScreen);
        WallButton button2 = new WallButton(lowerScreen);

        button1.push();
        button2.push();
    }
}
