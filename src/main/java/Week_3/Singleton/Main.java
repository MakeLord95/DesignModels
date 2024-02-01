package Week_3.Singleton;

public class Main {
    public static void main(String[] args) {
        DatabaseConnector connector = DatabaseConnector.getInstance();

        connector.connect();
        connector.query("SELECT * FROM users");
        connector.disconnect();
    }
}
