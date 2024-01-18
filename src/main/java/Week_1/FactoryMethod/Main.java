package Week_1.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        DiningCreature teacher = new Teacher();
        DiningCreature principal = new Principal();
        DiningCreature assisantTeacher = new AssistantTeacher();

        teacher.dine();
        principal.dine();
        assisantTeacher.dine();
    }
}
