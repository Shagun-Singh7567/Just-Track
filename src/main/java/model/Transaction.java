package model;

import java.sql.Timestamp;
import java.util.UUID;

public class Transaction {
    private String id = UUID.randomUUID().toString();
    private String userId = "";
    private double amt = 0.0;
    private TransactionType type;
    private Timestamp date;
    private String note = "";
    

    public Transaction(String userId, double amt, TransactionType type, Timestamp date, String note)
    {
        this.userId = userId;
        this.amt = amt;
        this.type = type;
        this.date = date;
        this.note = note;
    }

    // Overloaded constructor for when object is created at the time of user input
    public Transaction(double amt, TransactionType type, Timestamp date, String note)
    {
        this.amt = amt;
        this.type = type;
        this.date = date;
        this.note = note;
    }


    public String getId()
    {
        return id;
    }

    public void setId(String Id)
    {
        id = Id;
    }

    public String getUserId()
    {
        return userId;
    }

    public void setUserId(String UserId)
    {
        userId = UserId;
    }

    public double getAmount()
    {
        return amt;
    }

    public void setAmount(double Amount)
    {
        amt = Amount;
    }

    public TransactionType getType()
    {
        return type;
    }

    public void setType(TransactionType Type)
    {
        type = Type;
    }

    public Timestamp getDate()
    {
        return date;
    }

    public void setDate(Timestamp date)
    {
        this.date = date;
    }

    public String getNote()
    {
        return note;
    }

    public void setNote(String Note)
    {
        note = Note;
    }



}
