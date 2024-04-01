package Week_9.Builder;

import java.util.List;

public class Hamburger {
    private final List<String> parts;

    public Hamburger(List<String> parts) {
        this.parts = parts;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String part : parts) {
            stringBuilder.append(part).append("\n");
        }
        return stringBuilder.toString();
    }
}
