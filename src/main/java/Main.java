import java.util.InputMismatchException;
import java.util.Scanner;

import ui.TransactionUI;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int f = 1;
        while(f != 0)
        {
        System.out.println("Welcome to JustTrack!");
        System.out.println("1 to add a transaction \n2 to read all transactions\n3 to update a transaction\n4 to delete a transaction");
        char ch = sc.next().charAt(0);
        switch(ch)
        {
            case '1':
            TransactionUI.add();
            break;

            case '2':
            TransactionUI.read();
            break;

            case '3':
            TransactionUI.update();
            break;

            case '4':
            TransactionUI.delete();
            break;

            default:
            System.out.println("Sorry, the value you have entered seems to be inappropriate.\nPress 1 to try again, and 2 to exit");
            try
            {
            int terminateChoice = sc.nextInt();
            if(terminateChoice == 1)
            f = 1;
            else if(terminateChoice == 2)
            f = 0;
            else
            System.out.println("That's not a choice!");
            }
            catch(InputMismatchException e)
            {
                System.out.println("That wasn't an integer! Please try again");
                f = 1;
            }
        }
        int continueChoice;
        System.out.println("Do you want to continue? Press 0 if not, otherwise press any other numberk");
            System.out.println("Enter your choice: ");
            if(sc.hasNextInt())
            {
            continueChoice = sc.nextInt();
             if(continueChoice == 0)
            f = 0;
            }
            
       
    }
    System.out.println("Thank you for using JustTrack!\nYou are now exiting the application...");
    }
}
