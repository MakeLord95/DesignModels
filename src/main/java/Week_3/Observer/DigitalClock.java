package Week_3.Observer;

import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer {
    private final ClockTimer timer;

    public DigitalClock(ClockTimer ct) {
        timer = ct;
        timer.addObserver(this);
    }

    public void draw() {
        int hour = timer.getHour();
        int minute = timer.getMinute();
        int second = timer.getSecond();

        System.out.printf("%02d.%02d.%02d\n", hour, minute, second);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o == timer) {
            draw();
        }
    }
}
