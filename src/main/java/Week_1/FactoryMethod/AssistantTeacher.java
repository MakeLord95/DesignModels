package Week_1.FactoryMethod;

public class AssistantTeacher extends Teacher{
    public Drink createDrink() {
        return new Milk();
    }
}
