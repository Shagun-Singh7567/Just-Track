package ui;

import java.util.Scanner;

import service.TransactionService;

public class TransactionUI {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your transaction details: ");
        System.out.println("Enter the amount: ");
        double amt = sc.nextInt();
        System.out.println("Press I for income and E for expense: ");
        char t = sc.next().charAt(0);
        System.out.println("Enter a note (optional): ");
        String note = sc.nextLine();
        
        TransactionService.add("a","shagun",amt,t,note);

    }
}
