package dao;

import java.sql.*;


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

    public static void update(String i) throws SQLException
    {
        double amt = 0;
        String type = "";
        Timestamp date = new Timestamp(System.currentTimeMillis());
        String note = "";

        String updateRecordQuery = "update TRANSACTIONS set amt = ?, type = ?, transaction_date = ?, note = ? where serial_number = "+i;
        try (Connection conn = DatabaseConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(updateRecordQuery)) {
        
        String readRecordQuery = "select amt, type, transaction_date, note from TRANSACTIONS where serial_number = "+i;
        try (Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(readRecordQuery)) {
    
        System.out.println("Amount\t\tType\t\tDate\t\t\t\tNote");
            while (rs.next()) {
                amt = rs.getDouble("amt");
                type = rs.getString("type");
                date = rs.getTimestamp("transaction_date");
                note = rs.getString("note");
    
                System.out.println(amt + "\t\t" + type + "\t\t" + date + "\t\t" + note);
                }
            }

        ps.setDouble(1, amt);
        ps.setString(2, type);
        ps.setTimestamp(3, date);
        ps.setString(4, note);

        ps.executeUpdate();
    }
}
}