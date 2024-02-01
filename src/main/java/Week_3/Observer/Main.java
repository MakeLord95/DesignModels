package Week_3.Observer;

public class Main {
    public static void main(String[] args) {
        ClockTimer timer = new ClockTimer();
        DigitalClock digitalClock = new DigitalClock(timer);

        digitalClock.draw();

        for (int i = 0; i < 125; i++) {
            try {
                Thread.sleep(250);

                timer.tick();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
