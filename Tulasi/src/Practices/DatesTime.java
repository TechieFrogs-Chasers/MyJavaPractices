package Practices;

import java.util.Date;
import java.util.Objects;

public class DatesTime {
    public static void main(String[] args) {
        Date d1 = new Date();//Date() -Constructor
        System.out.println("Current date is :" + d1);
        Date d2 = new Date(2323232323L);//Date(long milliseconds)
        System.out.println("Date represented is :" + d2);
        //methods for date

        Date date1 = new Date(2021, 11, 02);
        Date date2 = new Date(1983, 10, 10);

        //Use of after() method to check date2 is after date1
        boolean a = date2.after(date1);
        System.out.println("Is date2 comes after date1: " + a);

        //Use of after() method to check date2 is after date1
        a = date1.after(date2);
        System.out.println("Is date1 comes after date2: " + a);

        //Use clone() method-duplicates the invoking date object
        Object date3=date2.clone();
        System.out.println("Clone date3: "+ date3.toString());

        //Use of before() method to check date2 is after date1
        boolean b = date2.after(date1);
        System.out.println("Is date2 comes before date1: " + b);

        //Display the current date
        Date todayDate=new Date();
        System.out.println("Systemdate: " +todayDate.toString());

        //Used to set time by milliseconds.Add 1568 milliseconds to january 1,1970 to get new time.Change the current date and time to given time.
        todayDate.setTime(1568);
        System.out.println("Time after setting: "+ todayDate.toString());

        //hashcode() method-Returns a hash code for the invoking object-In this method we know how much time we added.
        int h=todayDate.hashCode();
        System.out.println("Amount(in ms)by which time is shifted : "+h);

        //CompareTo(Date date) method
        int comparsion =d1.compareTo(d2);//d1>d2
        int comparsion1=d2.compareTo(d1);//d1<d2
        int comparsion2=d1.compareTo(d1);//d1=d1

        System.out.println("d1>d2 : "+ comparsion);
        System.out.println("d1<d2 : "+ comparsion1);
        System.out.println("d1=d1 : "+ comparsion2);

        //equal() method
        boolean i=d1.equals(d2);
        System.out.println("i: "+ i);
        boolean j=d1.equals(d1);
        System.out.println("j: "+ j);

        //getTime() method
        long count=d1.getTime();
        long count1=d2.getTime();
        System.out.println("Milliseconds d1: "+count);
        System.out.println("Milliseconds d2: "+count1);

        //Sleep() method-sleep for a while -You can sleep for any period of time from one millisecond upto the lifetime of your computer.

    }
}
