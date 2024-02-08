package Week_4.State;

public class CharizardState implements PokemonState {
    @Override
    public void attack() {
        System.out.println("Charizard used Flamethrower!");
    }
}
