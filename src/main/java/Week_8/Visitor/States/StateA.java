package Week_8.Visitor.States;

import Week_8.Visitor.Context;
import Week_8.Visitor.Interfaces.State;

public class StateA implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("State A");
    }

    @Override
    public String toString() {
        return "State A";
    }
}
