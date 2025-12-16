package auth;

import java.util.Scanner;
import utility.passwordHandler;
import java.sql.*;

public class AuthManager {
    static Scanner sc = new Scanner(System.in);
    public String[] signUp()
    {
       passwordHandler pObj = new passwordHandler(); 
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
            AuthManager obj = new AuthManager();
            String url = "jdbc:mysql://localhost:3306/just_track_db";
            Connection dbConnection = DriverManager.getConnection(url, "root","root");
      
            Statement st = dbConnection.createStatement();
            
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
                PreparedStatement ps = dbConnection.prepareStatement(insertUserQuery);
                ps.setString(1, signUpDetails[0]);
                ps.setString(2, signUpDetails[1]);
                ps.execute();

                case '2':
                obj.login();

            } 


      
          } catch (SQLException ex) {
            System.out.println("An error occurred while connecting MySQL databse");
            ex.printStackTrace();
          }

    }
}
