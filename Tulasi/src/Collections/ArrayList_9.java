package Collections;

import java.util.ArrayList;
import java.util.Collections;

// Write a Java program to copy one array list into another.
public class ArrayList_9 {
    public static void main(String[] args) {
        ArrayList<String> als = new ArrayList<>();
        als.add("Red");
        als.add("Blue");
        als.add("White");
        als.add("Green");
        System.out.println("List1-"+als);
        ArrayList<String> als1 = new ArrayList<>();
        als1.add("Dark");
        als1.add("Light");
        als1.add("Bright");
        als1.add("Shadow");
        System.out.println("List2-"+als1);
       // Collections.copy(als,als1);
        Collections.copy(als1,als);
        System.out.println("List1-\n"+als);
        System.out.println("List2-\n"+als1);



    }
}
