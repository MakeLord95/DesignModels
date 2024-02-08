package Week_4.State;

public class CharmanderState implements PokemonState {
    @Override
    public void attack() {
        System.out.println("Charmander used Ember!");
    }
}
