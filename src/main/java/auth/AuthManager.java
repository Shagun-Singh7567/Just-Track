package auth;

import java.util.Scanner;
import utility.passwordHandler;
import java.sql.*;

public class AuthManager {
    passwordHandler pObj = new passwordHandler(); 
    static Scanner sc = new Scanner(System.in);
    public String[] signUp()
    {
       String username = "";
       String password = "";
       do
       {
        System.out.println("Enter a username: ");
        username = sc.nextLine();
       }
       while(usernameValidator(username) == false);

       do
       {
       System.out.println("Enter your password: ");
       password = sc.nextLine();
       }
       while(pObj.passwordValidator(password) == false);
       password = pObj.hash(password);
       
        String[] signUpDetails = {username, password};
        return signUpDetails;
    }

    public String[] login()
    {
        System.out.println("Enter your username");
        String inputUsername = sc.nextLine();
        System.out.println("Enter your password");
        String inputPassword = sc.nextLine();
        inputPassword = pObj.hash(inputPassword);

        String[] userDetails = {inputUsername, inputPassword};
        return userDetails;
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



    public static void main(String args[]) throws SQLException
    {
       
            AuthManager obj = new AuthManager();
            Connection conn = DBManager.getConnection();
      
            Statement st = conn.createStatement();
            
            String createTableQuery = "create table if not exists USERS (id int primary key auto_increment, username varchar(100) , password varchar(64))";
            st.execute(createTableQuery);
           

            st.execute("delete from USERS");

            System.out.println("Press 1 to sign up, 2 to login to an existing account");
            char ch = sc.nextLine().charAt(0);
            switch (ch)
            {
                case '1':
                System.out.println("Let's create your account!");
                String[] signUpDetails = obj.signUp();

                String insertUserQuery = "INSERT INTO USERS (username, password) VALUES (?, ?)";
                PreparedStatement ps = conn.prepareStatement(insertUserQuery);
                ps.setString(1, signUpDetails[0]);
                ps.setString(2, signUpDetails[1]);
                ps.execute();

                case '2':
                obj.login();
                String[] loginDetails = obj.login();

                String checkUserQuery = "";

            } 


      
          } 

    }
