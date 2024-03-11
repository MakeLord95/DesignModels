package Week_7.Memento;

public class Main {
    public static void main(String[] args) {
        GuessMaster guessMaster = new GuessMaster();
        Guesser guesser = new Guesser(guessMaster);

        // Single guesser version
        guesser.run();

        // Uncomment the following lines for the multi-guesser version
        /*
        Thread guesserThread1 = new Thread(guesser);
        Thread guesserThread2 = new Thread(guesser);

        guesserThread1.start();
        guesserThread2.start();
        */
    }
}
