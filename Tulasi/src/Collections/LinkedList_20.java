package Collections;

import java.util.Collections;
import java.util.LinkedList;

//Write a Java program to retrieve but does not remove, the first element of a linked list.
public class LinkedList_20 {
    public static void main(String[] args) {
        LinkedList<String> lls = new LinkedList<>();
        lls.add("Red");
        lls.add("Blue");
        lls.add("White");
        lls.add("Green");
        System.out.println(lls);
        String retrieve=lls.peekFirst();
        System.out.println(retrieve);
        System.out.println(lls);
    }
}
