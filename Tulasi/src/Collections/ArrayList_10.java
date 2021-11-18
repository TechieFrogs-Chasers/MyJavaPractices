package Collections;

import java.util.ArrayList;
import java.util.Collections;

//Write a Java program to shuffle elements in a array list.
public class ArrayList_10 {
    public static void main(String[] args) {

        ArrayList<String> als = new ArrayList<>();
        als.add("Red");
        als.add("Blue");
        als.add("White");
        als.add("Green");
        System.out.println("List before shuffle -\n" + als);
        Collections.shuffle(als);
        System.out.println("List after shuffle -\n" + als);
    }
}
