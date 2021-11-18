package Collections;

import java.util.ArrayList;
import java.util.Collections;

//Write a Java program to sort a given array list.
public class ArrayList_8 {
    public static void main(String[] args) {
        ArrayList<String> als=new ArrayList<>();
        als.add("Red");
        als.add("Blue");
        als.add("White");
        als.add("Green");
        System.out.println("ArrayList beforw sorting-"+als);
        Collections.sort(als);//to sort the elements we use Collections.sort()
        System.out.println("ArrayList after sorting-"+als);
    }
}
