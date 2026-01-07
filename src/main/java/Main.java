import java.util.Scanner;

import ui.TransactionUI;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to JustTrack!");
        System.out.println("1 to add a transaction \n2 to read all transactions");
        char ch = sc.next().charAt(0);
        switch(ch)
        {
            case '1':
            TransactionUI.add();

            case '2':
            TransactionUI.read();
        }
    }
}
