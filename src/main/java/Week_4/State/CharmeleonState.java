package Week_4.State;

public class CharmeleonState implements PokemonState {
    @Override
    public void attack() {
        System.out.println("Charmeleon used Fire Fang!");
    }
}
