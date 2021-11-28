package Collections;

import java.util.ArrayList;

// Write a Java program to search an element in a array list.
public class ArrayList_7 {
    public static void main(String[] args) {
        ArrayList<String> als=new ArrayList<>();
        als.add("Red");
        als.add("Blue");
        als.add("White");
        als.add("Green");
        System.out.println(als);
       if(als.contains("Blue")){
           System.out.println("Blue element is there in arraylist!");
       }
       else {
           System.out.println("There is no blue element in this arraylist!");
       }
    }
}
