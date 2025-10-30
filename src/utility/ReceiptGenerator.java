package utility;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class ReceiptGenerator {
    
public void CSVMaker (ArrayList<String> list, String str) throws IOException
{
    String s = "";
    FileWriter printer = new FileWriter(str,true);
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

    public static void main(ArrayList<String> list,String str) throws IOException
    {
       ReceiptGenerator obj = new ReceiptGenerator();
       obj.CSVMaker(list, str);
    }
}
