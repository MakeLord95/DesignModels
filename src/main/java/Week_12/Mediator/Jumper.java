package Week_12.Mediator;

public class Jumper {
    private final Jump[] jumps;

    public Jumper() {
        this.jumps = new Jump[2];
    }

    public Jump[] getJumps() {
        return jumps;
    }

    @Override
    public String toString() {
        return "Jumper";
    }
}
