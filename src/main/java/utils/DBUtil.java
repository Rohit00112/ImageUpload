package utils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.InputStream;

public class DBUtil {

    public Connection getConnection() {
        Properties props = new Properties();
        try (InputStream is =
                     getClass().getClassLoader().getResourceAsStream("db.properties")) {
            props.load(is);
            String url = props.getProperty("db.url");
            String user = props.getProperty("db.user");
            String password = props.getProperty("db.password");
            return DriverManager.getConnection(url, user, password);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
