package utlility;
import java.util.*;

public class DateManager {
    public void currentDateGetter()
    {
        Date d1 = new Date();
        System.out.println("The current date is: " +d1);
    }

    public static void main(String args[])
    {
        DateManager obj = new DateManager();
        obj.currentDateGetter();
    }
}
