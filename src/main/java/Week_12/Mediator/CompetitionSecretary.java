package Week_12.Mediator;

public class CompetitionSecretary {
    public double calculateScores(Jump jump, int stylePoints) {
        return jump.getLength() + stylePoints;
    }
}
