package StringsAssignment;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Assignment3 {
    public static void main(String[] args) {
        Date date = Calendar.getInstance().getTime();
        System.out.println(date);
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
         String strDate = dateFormat.format(date); 
         System.out.println(strDate);
    }
}
