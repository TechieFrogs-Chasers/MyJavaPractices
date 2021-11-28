package Collections;

import java.util.ArrayList;

// Write a Java program to retrieve an element (at a specified index) from a given array list.
public class ArrayList_4 {
    public static void main(String[] args) {
        ArrayList <String> als=new ArrayList<>();
        als.add("Red");
        als.add("Blue");
        als.add("White");
        als.add("Green");
        System.out.println(als);

        String element= als.get(1);
        System.out.println("First element-"+ element);
        element=als.get(3);
        System.out.println("Third element-"+ element);

    }
}
