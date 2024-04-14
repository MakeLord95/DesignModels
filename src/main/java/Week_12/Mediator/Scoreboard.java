package Week_12.Mediator;

import java.util.ArrayList;
import java.util.List;

public class Scoreboard {
    private final List<ResultRow> resultRows;

    public Scoreboard() {
        this.resultRows = new ArrayList<>();
    }

    public void addResultRow(ResultRow row) {
        resultRows.add(row);
    }

    public void displayScoreboard() {
        System.out.println("Final Scoreboard:");
        System.out.println("Jumper\t\tTotal Score");
        System.out.println("--------------------------");
        for (ResultRow row : resultRows) {
            System.out.printf("%s\t\t\t%.2f\n", row.getJumper(), row.getTotalScore());
        }
    }
}
