package Model;

import java.sql.Connection;

/**
 * Created by Krasimir Stoyanov on 27-Jan-17.
 */
public enum Database {
    INSTANCE;

    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public void connect() throws Exception {
        if (connection != null) {
            System.out.println("Already connected");
        }
        System.out.println("Connected");
    }

    public void disconnect() {
        System.out.println("Disconnected");
    }
}
