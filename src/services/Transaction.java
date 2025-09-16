package services;
import java.util.Scanner;

import utility.DateManager;
public class Transaction {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's add a transaction you made!");
        System.out.println("Enter the amount you withdrew: ");
        int amtWithdrawn = sc.nextInt();
        System.out.println("Enter the reason for which you withdrew this amount: ");
        String type = sc.nextLine();
        String date = "";
        System.out.println("Was the transaction made today or before? (Y/N)");
        char ch = sc.nextLine().charAt(0);
        switch(ch)
        {
            case 'Y':
                {
                    DateManager dt = new DateManager();
                    date = dt.currentDateGetter();
                }
            case 'N':
                {
                    System.out.println("Enter the date please: ");
                    date = sc.nextLine();
                }
        }
      
        System.out.println("Enter the category of transaction: ");
        int category = sc.nextInt();
    }
    
}