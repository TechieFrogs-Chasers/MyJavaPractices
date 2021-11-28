package Collections;

import java.util.ArrayList;
import java.util.Iterator;

// Write a Java program to iterate through all elements in a array list.
public class ArrayList_2 {
    public static void main(String[] args) {
        ArrayList <String> als=new ArrayList<>();//ArrayList <String> als=new ArrayList<String>();
        als.add("Sunday");
        als.add("Monday");
        als.add("Tuesday");
        als.add("Wednesday");
        als.add("Thursday");
        als.add("Friday");
        als.add("Saturday");

       Iterator itr=als.iterator();
       while (itr.hasNext()){//here hasnext is Iterator interface method
           System.out.println(itr.next());
       }
    }
}
