package utility;

import java.io.IOException;
import java.util.ArrayList;

public class IncomeHandler {
    ArrayList<String> incomeDetails = new ArrayList<String>();
    private int amt;
    private String src;

    public IncomeHandler(int income, String source) throws IOException
    {
        amt = income;
        src = source;
        incomeDetails.add(String.valueOf(amt));
        incomeDetails.add(String.valueOf(src));
        
        String str = "Income-Details.csv";
       ReceiptGenerator.main(incomeDetails, str);
    }
    
}
