package Collections;

import java.util.ArrayList;

//Write a Java program to update specific array element by given element.
public class ArrayList_5 {
    public static void main(String[] args) {
        ArrayList<String> als=new ArrayList<>();
        als.add("Red");
        als.add("Blue");
        als.add("White");
        als.add("Green");
        System.out.println(als);
        als.set(0,"Pink");//to update or replace a element with other element we use set
        System.out.println(als);

    }
}
