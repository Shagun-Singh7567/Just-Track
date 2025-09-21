package services;
import java.util.Scanner;
public class Transaction {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's add a transaction you made!");
        System.out.println("Enter the amount you withdrew: ");
        int amtWithdrawn = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the reason for which you withdrew this amount: ");
        String type = sc.nextLine();
        System.out.println("Enter the date you withdrew: ");
        int date = sc.nextInt();
        System.out.println("Enter the category of transaction: ");
        int category = sc.nextInt();
    }
    
}