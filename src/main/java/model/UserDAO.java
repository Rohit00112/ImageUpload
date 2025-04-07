package model;

import utils.DBUtil;

import java.lang.reflect.Type;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

public class UserDAO {

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean registerUser(User user) throws SQLException {
        DBUtil db = new DBUtil();
        Connection conn = db.getConnection();
        String query = "INSERT INTO users (username,email,password,image)  VALUES (?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, user.getUsername());
        ps.setString(2, user.getEmail());
        ps.setString(3, user.getPassword());
        ps.setBytes(4, user.getImage());

        int row = ps.executeUpdate();
        conn.close();

        return row > 0;
    }
}
