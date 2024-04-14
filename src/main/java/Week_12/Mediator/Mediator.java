package Week_12.Mediator;

public class Mediator {
    private final Jumper jumper;
    private final Measurer measurer;
    private final Judges judges;
    private final Scoreboard scoreboard;
    private final CompetitionSecretary competitionSecretary;
    private Jump jump;

    public Mediator(Jumper jumper, Jump jump, Measurer measurer, Judges judges,
                    Scoreboard scoreboard, CompetitionSecretary competitionSecretary) {
        this.jumper = jumper;
        this.jump = jump;
        this.measurer = measurer;
        this.judges = judges;
        this.scoreboard = scoreboard;
        this.competitionSecretary = competitionSecretary;
    }

    public void conductJumpCompetition() {
        for (int i = 0; i < jumper.getJumps().length; i++) {
            double length = measurer.measureJumpLength();
            int stylePoints = judges.judgeStyle();
            jump = new Jump(length);
            double totalScore = competitionSecretary.calculateScores(jump, stylePoints);
            ResultRow resultRow = new ResultRow(jumper, totalScore);
            scoreboard.addResultRow(resultRow);
        }
    }
}
