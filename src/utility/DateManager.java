package utility;
import java.util.*;

public class DateManager {
    public String currentDateGetter()
    {
        Date d1 = new Date();
        return d1.toString();
    }


    public static void main(String args[])
    {
        DateManager obj = new DateManager();
        System.out.println(obj.currentDateGetter());
    }
}
