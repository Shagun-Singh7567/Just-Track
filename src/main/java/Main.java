
import java.io.IOException;
import java.util.Scanner;

import auth.*;
import services.*;
public class Main {
    public static void main(String args[]) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;
        while(isRunning)
        {
        System.out.println("Welcome to JustTrack - A simple budget tracker, made to help you be more financially responsible");
        System.out.println("Please press 1 to sign up to create a new account, and 2 to log in. Press 3 if you wish to leave");
        int c = sc.nextInt();
        switch(c)
        {
            case 1:
                AuthManager ob1 = new AuthManager();
                ob1.signUp();
                break;

            case 2:
                AuthManager ob2 = new AuthManager();
                ob2.login();
                break;
            
            default:
                System.out.println("Thank you for using our app!");
                System.exit(0);
        }
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
                System.out.println("Well, that didn't match any of the available services, can you please try again?");
                
                
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
