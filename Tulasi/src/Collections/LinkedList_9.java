package Collections;

import java.util.Collections;
import java.util.LinkedList;

//Write a Java program to insert some elements at the specified position into a linked list.
public class LinkedList_9 {
    public static void main(String[] args) {
        LinkedList<String> lls = new LinkedList<>();
        lls.add("Red");
        lls.add("Blue");
        lls.add("White");
        lls.add("Green");
        System.out.println("Orignial linked list-"+lls);
        LinkedList<String> lls1 = new LinkedList<>();
        lls1.add("Black");
        lls1.add("Light Pink");
        lls1.addAll(0, Collections.singleton("Pink"));
        System.out.println("Linked list-"+lls1);
    }
}
