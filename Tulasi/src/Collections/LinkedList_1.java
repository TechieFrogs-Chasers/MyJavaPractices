package Collections;

import java.util.ArrayList;
import java.util.LinkedList;

// Write a Java program to append the specified element to the end of a linked list.
public class LinkedList_1 {
    public static void main(String[] args) {//Linked list allow random access
        LinkedList<String> lls=new LinkedList<>();
        lls.add("Red");
        lls.add("Blue");
        lls.add("White");
        lls.add("Green");
        System.out.println(lls);
    }
}
