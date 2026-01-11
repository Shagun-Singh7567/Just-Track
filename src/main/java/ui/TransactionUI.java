package ui;

import java.util.Scanner;

import service.TransactionService;

public class TransactionUI {
    public static void add()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your transaction details: ");
        System.out.println("Enter the amount: ");
        double amt = sc.nextInt();
        System.out.println("Press I for income and E for expense: ");
        char t = sc.next().charAt(0);
        sc.nextLine();
        System.out.println("Enter a note (optional): ");
        String note = sc.nextLine();
        
        TransactionService.add("shagun",amt,t,note);
        sc.close();
    }

    public static void read()
    {
        TransactionService.read();
    }

    public static void update()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the serial number of the transaction");
        String i = sc.next();
        try{
            TransactionService.update(i);
        }
        catch(Exception e)
        {
            System.out.println("Perhaps ypur id was invalid - please try again");
        }
        sc.close();
    }
}
