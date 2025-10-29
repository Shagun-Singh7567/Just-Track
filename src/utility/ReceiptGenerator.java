package utility;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ReceiptGenerator {
    public static void main(ArrayList<String> list) throws IOException
    {
        String s = "";
        FileWriter printer = new FileWriter("List_of_Transactions.csv",true);
        BufferedWriter bw = new BufferedWriter(printer);
   
        for(int i = 0; i < list.size(); i++)
        {
            s = list.get(i);
            bw.write(s + ",");
            
        }
        bw.newLine();
        bw.close();
        System.out.println("Your transaction has been saved successfully!");
    }
}
