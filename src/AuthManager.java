import java.util.Scanner;

public class AuthManager {
    Scanner sc = new Scanner(System.in);
    public void signUp()
    {
       System.out.println("Let's create your account!");
       String username = "";
       String password = "";
       while(usernameValidator(username))
       {
       System.out.println("Enter a username: ");
       username = sc.nextLine();
       }
       do
       {
       System.out.println("Enter your password: ");
       password = sc.nextLine();
       }
       while(passwordValidator(password));
       password = hash(password);
       
    }

    public void login()
    {

    }

    private String hash(String pass)
    {
        return "";
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

    boolean passwordValidator(String pass)
    {
        return false;
    }

}
