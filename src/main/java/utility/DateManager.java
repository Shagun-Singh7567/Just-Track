package utility;
import java.util.*;

public class DateManager {
    public String currentDateGetter()
    {
        Date d1 = new Date();
        String date = d1.toString();
        date = date.substring(0,11) + date.substring(24,28);
        return date;
    }

    public void datePrinter()
    {
        System.out.println(currentDateGetter());
    }


}
