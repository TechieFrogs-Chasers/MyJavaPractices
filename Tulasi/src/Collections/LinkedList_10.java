package Collections;

import java.util.LinkedList;

//Write a Java program to get the first and last occurrence of the specified elements in a linked list.
public class LinkedList_10 {
    public static void main(String[] args) {
        LinkedList<String> lls = new LinkedList<>();
        lls.add("Red");
        lls.add("Blue");
        lls.add("White");
        lls.add("Green");
        System.out.println(lls);

        System.out.println("First element in linked list-"+lls.getFirst());
        System.out.println("Last element in linked list-"+lls.getLast());
    }
}
