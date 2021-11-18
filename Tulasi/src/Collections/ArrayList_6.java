package Collections;

import java.util.ArrayList;
//Write a Java program to remove the third element from a array list.
public class ArrayList_6 {
    public static void main(String[] args) {
        ArrayList <String> als=new ArrayList<>();
        als.add("Red");
        als.add("Blue");
        als.add("White");
        als.add("Green");
        System.out.println(als);
        als.remove(2);
        System.out.println(als);
    }
}
