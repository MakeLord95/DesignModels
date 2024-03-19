package Week_8.Visitor.States;

import Week_8.Visitor.Context;
import Week_8.Visitor.Interfaces.State;

public class StateB implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("State B");
    }

    @Override
    public String toString() {
        return "State B";
    }
}
