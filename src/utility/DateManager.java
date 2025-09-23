package utility;
import java.util.*;

public class DateManager {
    public String currentDateGetter()
    {
        Date d1 = new Date();
        return d1.toString();
    }

    public void datePrinter()
    {
        System.out.println(currentDateGetter());
    }


}
