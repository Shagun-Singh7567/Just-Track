package utility;

import java.util.ArrayList;

public class TransactionHandler {
    ArrayList<String> transactionDetails = new ArrayList<String>();
    private int amt;
    private String ty;
    private int dat;
    private String cat;

    public TransactionHandler(int amtWithdrawn, String type, int date, String category)
    {
        amt = amtWithdrawn;
        ty = type;
        dat = date;
        cat = category;
        
        transactionDetails.add(String.valueOf(amt));
        transactionDetails.add(String.valueOf(ty));
        transactionDetails.add(String.valueOf(dat));
        transactionDetails.add(String.valueOf(cat));

        
        
    }
    
}
