package Week_4.State;

public class Pokemon {
    private PokemonState currentState;

    public Pokemon() {
        currentState = new CharmanderState();
    }

    public void attack() {
        currentState.attack();

        if (currentState instanceof CharmanderState) {
            System.out.println("Charmander reached level 16!");
            evolve("Charmander", "Charmeleon");
            currentState = new CharmeleonState();

        } else if (currentState instanceof CharmeleonState) {
            System.out.println("Charmeleon reached level 36!");
            evolve("Charmeleon", "Charizard");
            currentState = new CharizardState();

        } else if (currentState instanceof CharizardState) {
            System.out.println("Charizard layed an egg!");
            hatchEgg();
            currentState = new CharmanderState();
        }
    }

    private void evolve(String previousName, String currentName) {
        try {
            System.out.printf("%s is evolving", previousName);
            for (int i = 0; i < 3; i++) {
                Thread.sleep(1000);
                System.out.print(".");
            }
            System.out.printf("\nCongratulations! %s evolved into %s!\n", previousName, currentName);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void hatchEgg() {
        try {
            System.out.print("The egg is hatching!");
            for (int i = 0; i < 3; i++) {
                Thread.sleep(1000);
                System.out.print(".");
            }
            System.out.print("\nCongratulations! The egg hatched into Charmander!\n");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
