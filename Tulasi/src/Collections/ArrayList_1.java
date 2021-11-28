package Collections;

import java.util.ArrayList;
import java.util.Iterator;

//Write a Java program to create a new array list, add some colors (string) and print out the collection.
public class ArrayList_1 {//ArrayList is random access
    public static void main(String[] args) {
        ArrayList<String> als=new ArrayList<String>();
        als.add("Red");
        als.add("Blue");
        als.add("White");
        als.add("Green");
        System.out.println(als);
    }
}
