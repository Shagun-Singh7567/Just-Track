package service;

import java.sql.SQLException;

import java.sql.Timestamp;

import dao.TransactionDAO;
import model.Transaction;
import model.TransactionType;

public class TransactionService {
    public static void add(String uId, double amt, char t, String note)
    {
        if(amt < 0)
        {
            System.out.println("Amount cannot be negative!");
            //Restart UI loop
        }
        
        TransactionType type;
        if(t == 'I')
        type = TransactionType.INCOME;
        else
        type = TransactionType.EXPENSE;
        
        Timestamp ts = new Timestamp(System.currentTimeMillis());


        Transaction tr = new Transaction(uId, amt, type, ts, note);
        try {
            TransactionDAO.createTable();
            System.out.println("Table created");
            TransactionDAO.add(tr);
            System.out.println("Transaction saved");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("An error ocurred while saving your data");
        }
    }

    public static void read()
    {
        try {
            TransactionDAO.createTable();
            System.out.println("Table created");
            TransactionDAO.read();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("An error ocurred while reading your data");
        }
    }

    public static void update(String i)
    {
        try {
            TransactionDAO.createTable();
            System.out.println("Table created");
            TransactionDAO.update(i);
        } catch (SQLException e) {
            System.out.println("An error ocurred while updating your data");
        }
    }
}
