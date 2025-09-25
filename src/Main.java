import java.io.FileNotFoundException;
import java.util.Scanner;
import services.*;
public class Main {
    public static void main(String args[]) throws FileNotFoundException
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
                break;

            case 'I':
                Income newIncomeRecord = new Income();
                break;

            case 'E':
                Expense newExpenseRecord = new Expense();
                break;
            default: 
                System.out.println("Well, that didn't match anything so far, but you did just discover a secret feature!!!");
                System.out.println("Here lies the key to solve all your personal budgeting problems in a quick excel file! Are you interested? (Y/N)");
                char secretChoice = sc.next().charAt(0);
                
        }       


        
    }
}
