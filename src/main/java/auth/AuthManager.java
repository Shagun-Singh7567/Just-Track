package auth;

import java.util.Scanner;
import utility.passwordHandler;
import java.sql.*;

public class AuthManager {
    Scanner sc = new Scanner(System.in);
    public void signUp()
    {
       passwordHandler pObj = new passwordHandler(); 
       System.out.println("Let's create your account!");
       String username = "";
       String password = "";
       while(usernameValidator(username) == false)
       {
       System.out.println("Enter a username: ");
       username = sc.nextLine();
       }
       do
       {
       System.out.println("Enter your password: ");
       password = sc.nextLine();
       }
       while(pObj.passwordValidator(password) == false);
       password = pObj.hash(password);

        System.out.println(username + " "  + password);
       
    }

    public void login()
    {

    }

    

    boolean usernameValidator(String uname)
    {
        if(uname != "already_taken_username")
        {
        System.out.println("Hey, that's a cool name, " + uname);
        return true;
        }

        else
        {
        System.out.println("This username is already taken, please try again!");
        return false;
        }
    }



    public static void main(String args[])
    {
        try {
            String url = "jdbc:mysql://localhost:3306/just_track_db";
            Connection dbConnection = DriverManager.getConnection(url, "root","root");
      
            Statement st = dbConnection.createStatement();
            
            System.out.println("Hallo");


      
          } catch (SQLException ex) {
            System.out.println("An error occurred while connecting MySQL databse");
            ex.printStackTrace();
          }

    }
}
