package Week_7.Memento;

public class Guesser implements Runnable {
    private final GuessMaster guessMaster;

    public Guesser(GuessMaster guessMaster) {
        this.guessMaster = guessMaster;
    }

    @Override
    public void run() {
        Memento memento = guessMaster.joinGame();

        int guess;

        while ((guess = guessMaster.makeGuess()) != memento.getNumber()) {
            System.out.printf("Guesser %d: Incorrect guess %d\n", Thread.currentThread().threadId(), guess);
        }

        System.out.printf("Guesser %d: Correct guess! Number was %d\n", Thread.currentThread().threadId(), guess);
    }
}
