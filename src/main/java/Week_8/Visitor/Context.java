package Week_8.Visitor;

import Week_8.Visitor.Interfaces.State;
import Week_8.Visitor.States.StateA;
import Week_8.Visitor.States.StateB;

public class Context {
    private State state;

    public Context() {
        state = new StateA();
    }

    public void changeState() {
        System.out.println("Context: Changing state.");
        if (state.toString().equals("State A")) {
            state = new StateB();
        } else {
            state = new StateA();
        }
    }

    public void request() {
        state.doAction(this);
    }
}
