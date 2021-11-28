package Collections;

import java.util.LinkedList;

//Write a Java program to insert elements into the linked list at the first and last position.
public class LinkedList_6 {
    public static void main(String[] args) {
        LinkedList<String> lls = new LinkedList<>();
        lls.add("Red");
        lls.add("Blue");
        lls.add("White");
        lls.add("Green");
        System.out.println(lls);
        lls.addFirst("Pink");
        lls.addLast("Black");
        System.out.println(lls);
    }
}
