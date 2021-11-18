package Collections;

import java.util.Collections;
import java.util.LinkedList;

// Write a Java program of swap two elements in a linked list.
public class LinkedList_15 {
    public static void main(String[] args) {
        LinkedList<String> lls = new LinkedList<>();
        lls.add("Red");
        lls.add("Blue");
        lls.add("White");
        lls.add("Green");
        System.out.println(lls);
        Collections.swap(lls,0,3);
        System.out.println(lls);
    }
}
