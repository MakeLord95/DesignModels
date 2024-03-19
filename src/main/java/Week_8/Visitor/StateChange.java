package Week_8.Visitor;

import Week_8.Visitor.Interfaces.Visitor;

public class StateChange implements Visitor {

    @Override
    public void visit(Context context) {
        System.out.println("StateChange: Changing state.");

        if (context.toString().equals("State A")) {
            context.changeState();
        } else {
            context.changeState();
        }
    }
}
