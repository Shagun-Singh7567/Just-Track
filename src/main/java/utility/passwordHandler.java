package utility;

import java.nio.charset.StandardCharsets;

import com.google.common.hash.Hashing;

public class passwordHandler {
        public boolean passwordValidator(String pass)
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

    public String hash(String pass)
    {
        String sha256hex = Hashing.sha256().hashString(pass, StandardCharsets.UTF_8).toString();
        return sha256hex;
    }


}
