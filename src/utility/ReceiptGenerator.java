package utility;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ReceiptGenerator {
    String s = "";
    void generateTransactionReceipt(ArrayList<String> list) throws FileNotFoundException
    {
        PrintWriter printer = new PrintWriter("List_of_Transactions.csv");
        for(int i = 0; i < list.size(); i++)
        {
            printer.write(s + ",");
            System.out.println("Your transaction has been saved successfully!");
        }
        printer.close();
    }
}
