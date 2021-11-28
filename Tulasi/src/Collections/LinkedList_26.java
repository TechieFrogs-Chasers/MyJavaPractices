package Collections;

import java.util.LinkedList;

// Write a Java program to replace an element in a linked list.
public class LinkedList_26 {
    public static void main(String[] args) {
        LinkedList<String> lls = new LinkedList<>();
        lls.add("Red");
        lls.add("Blue");
        lls.add("White");
        lls.add("Green");
        System.out.println(lls);
        lls.set(1,"Black");//for replace we use set()
        System.out.println(lls);
    }
}
