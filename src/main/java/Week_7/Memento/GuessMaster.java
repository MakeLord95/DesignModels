package Week_7.Memento;

import java.util.Random;

public class GuessMaster {
    public Memento joinGame() {
        int randomNumber = new Random().nextInt(100) + 1;
        System.out.printf("GuessMaster: Guesser %d joined the game with Memento %d\n", Thread.currentThread().threadId(), randomNumber);
        return new Memento(randomNumber);
    }

    public int makeGuess() {
        int guess = new Random().nextInt(100) + 1;
        System.out.printf("GuessMaster: Guesser %d guessed %d\n", Thread.currentThread().threadId(), guess);
        return guess;
    }
}
