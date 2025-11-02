package services;
import java.io.IOException;
import java.util.*;
import utility.IncomeHandler;
public class Income {
    public static void main(String args[]) throws IOException
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Let's record your income!");
    System.out.println("What's the source of this income?");
    String incomeSource = sc.nextLine();
    System.out.println("How much do you earn per month?");
    int incomePerMonth = sc.nextInt();


    IncomeHandler obj = new IncomeHandler(incomePerMonth, incomeSource);
    }



    
}
