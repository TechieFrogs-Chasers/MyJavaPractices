package Collections;

import java.util.LinkedList;

//Write a Java program to remove a specified element from a linked list.
public class LinkedList_12 {
    public static void main(String[] args) {
        LinkedList<String> lls = new LinkedList<>();
        lls.add("Red");
        lls.add("Blue");
        lls.add("White");
        lls.add("Green");
        System.out.println(lls);
        lls.remove(1);
        System.out.println(lls);
    }
}
