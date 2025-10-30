package utility;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class IncomeHandler {
    ArrayList<String> incomeDetails = new ArrayList<String>();
    private int amt;
    private String src;

    public IncomeHandler(int income, String source) throws IOException
    {
        income = amt;
        source = src;
        incomeDetails.add(String.valueOf(income));
        incomeDetails.add(String.valueOf(source));
        
        String str = "Income-Details.csv";
       ReceiptGenerator.main(incomeDetails, str);
    }
    
}
