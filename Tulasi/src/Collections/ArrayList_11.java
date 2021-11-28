package Collections;

import java.util.ArrayList;
import java.util.Collections;

//Write a Java program to reverse elements in a array list.
public class ArrayList_11 {
    public static void main(String[] args) {
        ArrayList<String> als = new ArrayList<>();
        als.add("Red");
        als.add("Blue");
        als.add("White");
        als.add("Green");
        System.out.println(als);
        Collections.reverse(als);
        System.out.println("After als reverse- \n"+als);
    }
}
