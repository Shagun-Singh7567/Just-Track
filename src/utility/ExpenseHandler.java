package utility;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ExpenseHandler {
    public ArrayList<String> expenseDetails = new ArrayList<String>();
    private int amt;
    private String cat;
    private String freq;

    public ExpenseHandler(int amtExpense, String catExpense, String freqExpense) throws FileNotFoundException
    {
        amt = amtExpense;
        cat = catExpense;
        freq = freqExpense;
        expenseDetails.add(String.valueOf(amt));
        expenseDetails.add(String.valueOf(cat));
        expenseDetails.add(String.valueOf(freq));
        
        
    }
    
}
