package Collections;

import java.util.ArrayList;

//Write a Java program to insert an element into the array list at the first position.
public class ArrayList_3 {
    public static void main(String[] args) {
        ArrayList<String> als = new ArrayList<>();
        als.add("Red");
        als.add("Blue");
        als.add("White");
        als.add("Green");
        System.out.println(als);

        als.add(0, "Pink");
        als.add(2, "Black");
        System.out.println(als);
    }
}
