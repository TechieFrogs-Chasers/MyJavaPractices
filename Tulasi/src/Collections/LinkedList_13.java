package Collections;

import java.util.LinkedList;

//Write a Java program to remove first and last element from a linked list.
public class LinkedList_13 {
    public static void main(String[] args) {
        LinkedList<String> lls = new LinkedList<>();
        lls.add("Red");
        lls.add("Blue");
        lls.add("White");
        lls.add("Green");
        System.out.println(lls);
        lls.removeFirst();
        lls.removeLast();
        System.out.println(lls);
    }
}
