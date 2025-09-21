import java.util.Scanner;
import services.*;
public class Main {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to JustTrack - A simple budget tracker, made to help you be more financially responsible");
        System.out.println("Press the specific letters in the terminal to perform the interaction you wish to perform: ");
        System.out.println("To make a transaction, press T");
        System.out.println("To record your income, press I");
        System.out.println("To record an expense, press E");
        char choiceInput= sc.next().charAt(0);
        switch(choiceInput)
        {
            case 'T':
                Transaction.main(new String[] {}); 

            case 'I':
                Income newIncomeRecord = new Income();

            case 'E':
                Expense newExpenseRecord = new Expense();
        }

        
    }
}
