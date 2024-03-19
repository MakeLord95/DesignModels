package Week_8.Visitor;

import Week_8.Visitor.Interfaces.Visitor;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        Visitor visitor = new StateChange();

        context.request();
        visitor.visit(context);
        context.request();
    }
}
