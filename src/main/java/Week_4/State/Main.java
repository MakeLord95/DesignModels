package Week_4.State;

public class Main {
    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon();

        for (int i = 0; i < 3; i++) {
            System.out.printf("---- Turn %d ----\n", i + 1);
            pokemon.attack();
            System.out.println();
        }
    }
}
