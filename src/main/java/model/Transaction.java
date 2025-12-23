package model;

public class Transaction {
    private String id = "";
    private String userId = "";
    private double amt = 0.0;
    private TransactionType type;
    private String date = "";
    private String note = "";

    public Transaction(String id, String userId, double amt, TransactionType type, String date, String note)
    {
        id = this.id;
        userId = this.userId;
        amt = this.amt;
        type = this.type;
        date = this.date;
        note = this.note;
    }

    // Overloaded constructor for when object is created at the time of user input
    public Transaction(String id, double amt, TransactionType type, String date, String note)
    {
        id = this.id;
        amt = this.amt;
        type = this.type;
        date = this.date;
        note = this.note;
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

    public String getDate()
    {
        return date;
    }

    public void setDate(String Date)
    {
        date = Date;
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
