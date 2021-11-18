package Collections;

import java.util.Collections;
import java.util.LinkedList;

//Write a Java program to remove and return the first element of a linked list.
public class LinkedList_19 {
    public static void main(String[] args) {
        LinkedList<String> lls = new LinkedList<>();
        lls.add("Red");
        lls.add("Blue");
        lls.add("White");
        lls.add("Green");
        System.out.println(lls);
        lls.pop();//pop() method will remove first element
        System.out.println(lls);
       // System.out.println(lls.retainAll(lls));
    }
}
