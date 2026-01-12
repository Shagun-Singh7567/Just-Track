package dao;

import java.sql.*;
import java.util.Scanner;

import db.DatabaseConnection;
import model.Transaction;

public class TransactionDAO {

    public static void createTable() throws SQLException
    {
        String createTableQuery = "create table if not exists TRANSACTIONS (serial_number integer auto_increment primary key, user_id varchar(100) not null, amt decimal(10,2) not null, type enum('INCOME', 'EXPENSE') not null, transaction_date timestamp not null, note varchar(500))";
        try (Connection conn = DatabaseConnection.getConnection();
         Statement st = conn.createStatement()) {
        st.execute(createTableQuery);
        }
    }

    public static void add(Transaction tr) throws SQLException
    {
        String addRecordQuery = "insert into TRANSACTIONS (user_id, amt, type, transaction_date, note) values (?, ?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(addRecordQuery)) {
        
        ps.setString(1, tr.getUserId());
        ps.setDouble(2, tr.getAmount());
        ps.setString(3, tr.getType().name());
        ps.setTimestamp(4, tr.getDate());
        ps.setString(5, tr.getNote());

        ps.executeUpdate();

   }
    }

    public static void read() throws SQLException
    {
        String readRecordQuery = "select serial_number, amt, type, transaction_date, note from TRANSACTIONS";
        try (Connection conn = DatabaseConnection.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(readRecordQuery)) {

        System.out.println("S.No.\t\tAmount\t\tType\t\tDate\t\t\t\tNote");
          while (rs.next()) {
              int serial_number = rs.getInt("serial_number");  
              double amt = rs.getDouble("amt");
              String type = rs.getString("type");
              Timestamp date = rs.getTimestamp("transaction_date");
              String note = rs.getString("note");

              System.out.println(serial_number + "\t\t" + amt + "\t\t" + type + "\t\t" + date + "\t\t" + note);
            }   
        }
    }

    public static void update(String i, double amt, String note) throws SQLException
    {
        String updateRecordQuery = "update TRANSACTIONS set amt = ?, note = ? where serial_number = "+i;
        try (Connection conn = DatabaseConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(updateRecordQuery)) {

        
        ps.setDouble(1, amt);
        ps.setString(2, note);

        ps.executeUpdate();

    }


}
}