package Week_3.Singleton;

public class DatabaseConnector {
    private static DatabaseConnector instance = null;

    private DatabaseConnector() {
    }

    public static DatabaseConnector getInstance() {
        if (instance == null) {
            instance = new DatabaseConnector();
        }

        return instance;
    }

    public void connect() {
        System.out.println("Connecting to database...");
    }

    public void disconnect() {
        System.out.println("Disconnecting from database...");
    }

    public void query(String query) {
        System.out.println("Querying database: " + query);
    }
}
