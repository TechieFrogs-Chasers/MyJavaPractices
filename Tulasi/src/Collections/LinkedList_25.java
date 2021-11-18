package Collections;

import java.util.LinkedList;

//Write a Java program to test an linked list is empty or not.
public class LinkedList_25 {
    public static void main(String[] args) {
        LinkedList<String> lls = new LinkedList<>();
        lls.add("Red");
        lls.add("Blue");
        lls.add("White");
        lls.add("Green");
        System.out.println(lls);
        System.out.println(lls.isEmpty());
        lls.removeAll(lls);
        System.out.println(lls);
        System.out.println(lls.isEmpty());
    }
}
