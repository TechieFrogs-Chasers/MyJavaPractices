package Collections;

import java.util.LinkedList;

//Write a Java program to insert the specified element at the front of a linked list.
public class LinkedList_7 {
    public static void main(String[] args) {
        LinkedList<String> lls = new LinkedList<>();
        lls.add("Red");
        lls.add("Blue");
        lls.add("White");
        lls.add("Green");
        System.out.println(lls);
        lls.offerFirst("Pink");
        System.out.println(lls);
    }
}