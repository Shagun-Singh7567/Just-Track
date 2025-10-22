import java.io.IOException;
import java.util.Scanner;
import services.*;
public class Main {
    public static void main(String args[]) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;
        while(isRunning)
        {
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
                Income.main(new String[] {});
                break;

            case 'E':
                Expense.main(new String[] {});
                break;
            default: 
                System.out.println("Well, that didn't match anything so far, but you did just discover a secret feature!!!");
                System.out.println("Here lies the key to solve all your personal budgeting problems in a quick excel file! Are you interested? (Y/N)");
                char secretChoice = sc.next().charAt(0);
                
        } 
        System.out.println("Thank you for using our app! Would you like to use another service? (Y/N)");
        char ch = sc.next().charAt(0);
            if(ch == 'Y')
                isRunning = true;   
            else
                isRunning = false;

    }
        
    }
}
