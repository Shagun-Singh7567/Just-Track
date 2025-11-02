package services;
import java.io.IOException;
import java.util.*;

import utility.ExpenseHandler;
public class Expense {
    public static void main(String args[]) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's record an expense!");
        System.out.println("Enter the category for which this expense was made: ");
        String catExpense = sc.nextLine();
        System.out.println("Enter the amount of the expense: ");
        int amtExpense = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the frequency at which this expense is made: ");
        String freqExpense = sc.nextLine();
        ExpenseHandler obj = new ExpenseHandler(amtExpense, catExpense, freqExpense);
       
    
    }
}
