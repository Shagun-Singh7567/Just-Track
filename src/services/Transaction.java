package services;
import java.io.IOException;
import java.util.Scanner;

import utility.DateManager;
import utility.TransactionHandler;
public class Transaction {

    public static void main(String args[]) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's add a transaction you made!");
        System.out.println("Enter the amount you withdrew: ");
        int amtWithdrawn = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the reason for which you withdrew this amount: ");
        String type = sc.nextLine();
        String date = "";
        System.out.println("Was the transaction made today or before? Press 'Y' if yes, otherwise type any other character");
        char ch = sc.nextLine().charAt(0);
        switch(ch)
        {
            case 'Y':
                {
                    DateManager dt = new DateManager();
                    date = dt.currentDateGetter();
                    System.out.println("Is this the date today? (" + date + ") If we got it wrong, press N, otherwise press any other key to continue");
                    char currentDateChoiceChecker = sc.nextLine().charAt(0);
                    if(currentDateChoiceChecker == 'N')
                    {
                        System.out.println("Sorry, please enter the date manually");
                        date = sc.nextLine();
                        break;

                    }
                    else
                    {
                        break;
                    }
                  
                }
            default:
                {
                    System.out.println("Enter the date please: ");
                    date = sc.nextLine();
                }
        }
      
        System.out.print("Enter the category of transaction: ");
        String category = sc.nextLine();
        TransactionHandler obj = new TransactionHandler(amtWithdrawn,type,date,category);
    }
    
}