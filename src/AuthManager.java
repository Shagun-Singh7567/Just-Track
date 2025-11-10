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
        boolean upperCase = false;
        boolean lowerCase = false;
        boolean digit = false;
        boolean specialCharacter = false;
        if(pass.length() < 8 || pass.length() > 15) // Password length
        {
        System.out.println("Please maintain password length between 8 and 15");
        return false;
        }
        
        for(int i = 0; i < pass.length(); i++)
        {
        char ch = pass.charAt(i);
        
        if(Character.isWhitespace(ch))
            {
            System.out.println("Passwords can't contain empty spaces!");
            return false;
            }
        
        if(Character.isUpperCase(ch))
        upperCase = true;

        if(Character.isLowerCase(ch))
        lowerCase = true;

        if(Character.isDigit(ch))
        digit = true;

        if(Character.isLetterOrDigit(ch) == false)
        specialCharacter = true;

        }

        if(upperCase == false || lowerCase == false || digit == false || specialCharacter == false)
        {
            System.out.println("You are missing either/all of the following: an upper case letter, a lower case letter, a digit, or a special character. Please try again");
        }

        return true;
    }

    public static void main(String args[])
    {
        AuthManager obj = new AuthManager();
        obj.signUp();
    }
}
