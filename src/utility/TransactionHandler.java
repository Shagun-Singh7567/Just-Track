package utility;

import java.io.IOException;
import java.util.ArrayList;

public class TransactionHandler {
    ArrayList<String> transactionDetails = new ArrayList<String>();
    private int amt;
    private String ty;
    private String dat;
    private String cat;

    public TransactionHandler(int amtWithdrawn, String type, String date, String category) throws IOException
    {
        amt = amtWithdrawn;
        ty = type;
        dat = date;
        cat = category;
        
        transactionDetails.add(String.valueOf(amt));
        transactionDetails.add(String.valueOf(ty));
        transactionDetails.add(String.valueOf(dat));
        transactionDetails.add(String.valueOf(cat));

       ReceiptGenerator.main(transactionDetails);
        
    }
    
}
