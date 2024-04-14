package Week_12.Prototype;

public class Main {
    public static void main(String[] args) {
        Clock originalClock = new Clock(10, 30);

        try {
            Clock shallowCopy = (Clock) originalClock.clone();
            System.out.printf("Shallow Copy: %s\n", shallowCopy);

            Clock deepCopy = new Clock(originalClock.getHours(), originalClock.getMinutes());
            System.out.printf("Deep Copy: %s\n", deepCopy);

            originalClock.setHours(12);
            originalClock.setMinutes(45);

            System.out.printf("Original Clock after modification: %s\n", originalClock);
            System.out.printf("Shallow Copy after modification: %s\n", shallowCopy);
            System.out.printf("Deep Copy after modification: %s\n", deepCopy);

        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
    }
}
