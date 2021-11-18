package Collections;

import java.util.Collections;
import java.util.LinkedList;

//Write a Java program to clone an linked list to another linked list.
public class LinkedList_18 {
    public static void main(String[] args) {
        LinkedList<String> lls = new LinkedList<>();
        lls.add("Red");
        lls.add("Blue");
        lls.add("White");
        lls.add("Green");
        System.out.println(lls);
        lls.clone();
        System.out.println(lls);
    }
}
