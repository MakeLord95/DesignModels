package Week_3.Observer;

import java.util.Observable;

public class ClockTimer extends Observable {
    private int second;
    private int minute;
    private int hour;

    int getSecond() {
        return second;
    }

    int getMinute() {
        return minute;
    }

    int getHour() {
        return hour;
    }

    void tick() {
        second = (second + 1) % 60;
        if (second == 0) {
            minute = (minute + 1) % 60;
            if (minute == 0) {
                hour = (hour + 1) % 24;
            }
        }
        setChanged();
        notifyObservers();
    }
}
