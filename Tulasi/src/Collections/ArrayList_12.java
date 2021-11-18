package Collections;
// Write a Java program to extract a portion of a array list.

import java.util.ArrayList;
import java.util.List;

public class ArrayList_12 {
    public static void main(String[] args) {
        ArrayList<String> als = new ArrayList<>();
        als.add("Red");
        als.add("Blue");
        als.add("White");
        als.add("Green");
        als.add("Black");
        als.add("Pink");
        System.out.println("Before extract a portion of a arraylist"+als);
        List<String> element= als.subList(0,3);
        System.out.println("After extract a portion of a arraylist"+ element);
    }
}
