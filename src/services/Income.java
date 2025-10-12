package services;
import java.io.FileNotFoundException;
import java.util.*;
import utility.IncomeHandler;
public class Income {
    public static void main(String args[]) throws FileNotFoundException
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Let's record your income!");
    System.out.println("How much do you earn per month?");
    int incomePerMonth = sc.nextInt();
    System.out.println("What's the source of this income?");
    String incomeSource = sc.nextLine();
    sc.nextLine();

    IncomeHandler obj = new IncomeHandler(incomePerMonth, incomeSource);
    }



    
}
