package auth;

import java.sql.*;

public class DBManager {
        private static Connection connection;
    
        public static Connection getConnection() throws SQLException {
            if (connection == null || connection.isClosed()) {
                String url = "jdbc:mysql://localhost:3306/just_track_db";
                connection = DriverManager.getConnection(url, "root","root");
            }
            return connection;
        }
    
}
