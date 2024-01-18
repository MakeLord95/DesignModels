package Week_1.FactoryMethod;

public class Principal extends Teacher {

        public Drink createDrink() {
            return new Coffee();
        }
}
