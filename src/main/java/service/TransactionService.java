package service;

import java.sql.SQLException;

import dao.TransactionDAO;
import model.Transaction;
import model.TransactionType;

public class TransactionService {
    void add(String id, double amt, char t, String note)
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
        
        Transaction tr = new Transaction(id, amt, type, note);
        try {
            TransactionDAO.add(tr);
            System.out.println("Transaction saved");
        } catch (SQLException e) {
            System.out.println("An error ocurred while saving your data");
        }
    }
}
