package Collections;

import java.util.Iterator;
import java.util.TreeSet;

//Write a Java program to iterate through all elements in a tree set.
public class TreeSet_2 {
    public static void main(String[] args) {
        TreeSet<String> t_Set = new TreeSet<>();
        t_Set.add("Red");
        t_Set.add("Blue");
        t_Set.add("White");
        t_Set.add("Green");
        t_Set.add("Pink");
        t_Set.add("Yellow");

        for(String set:t_Set){
            System.out.println(set);
        }
    }
}
