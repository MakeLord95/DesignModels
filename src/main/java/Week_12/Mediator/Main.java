package Week_12.Mediator;

public class Main {
    public static void main(String[] args) {
        Jumper jumper = new Jumper();
        Jump jump = new Jump(0);
        Measurer measurer = new Measurer();
        Judges judges = new Judges();
        Scoreboard scoreboard = new Scoreboard();
        CompetitionSecretary competitionSecretary = new CompetitionSecretary();

        Mediator mediator = new Mediator(jumper, jump, measurer, judges, scoreboard, competitionSecretary);

        mediator.conductJumpCompetition();

        scoreboard.displayScoreboard();
    }
}
