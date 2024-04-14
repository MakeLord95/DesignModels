package Week_12.Mediator;

public class ResultRow {
    private final Jumper jumper;
    private final double totalScore;

    public ResultRow(Jumper jumper, double totalScore) {
        this.jumper = jumper;
        this.totalScore = totalScore;
    }

    public Jumper getJumper() {
        return jumper;
    }

    public double getTotalScore() {
        return totalScore;
    }
}
