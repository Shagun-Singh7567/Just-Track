package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DatabaseConnection;

public class TransactionDAO {
    void createTable() throws SQLException
    {
        String createTableQuery = "create table if not exists TRANSACTIONS (id int primary key auto_increment, user_id varchar(100) not null, amt decimal(10,2) not null, type enum('INCOME', 'EXPENSE') not null, transaction_date timestamp not null, note varchar(500))";
        try (Connection conn = DatabaseConnection.getConnection();
         Statement st = conn.createStatement()) {
        st.execute(createTableQuery);
        }   
    }
}
