package Collections;

import java.util.Collections;
import java.util.LinkedList;

// Write a Java program to shuffle the elements in a linked list.
public class LinkedList_16 {
    public static void main(String[] args) {
        LinkedList<String> lls = new LinkedList<>();
        lls.add("Red");
        lls.add("Blue");
        lls.add("White");
        lls.add("Green");
        System.out.println(lls);
        Collections.shuffle(lls);
        System.out.println(lls);
    }
}
