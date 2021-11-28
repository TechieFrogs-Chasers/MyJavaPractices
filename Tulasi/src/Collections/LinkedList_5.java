package Collections;

import java.util.Collections;
import java.util.LinkedList;

//Write a Java program to insert the specified element at the specified position in the linked list.
public class LinkedList_5 {
    public static void main(String[] args) {
        LinkedList<String> lls = new LinkedList<>();
        lls.add("Red");
        lls.add("Blue");
        lls.add("White");
        lls.add("Green");
        System.out.println(lls);
        lls.add(1,"Pink");
        System.out.println(lls);
    }
}