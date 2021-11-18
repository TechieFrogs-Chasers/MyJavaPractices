package Collections;

import java.util.LinkedList;

// Write a Java program to display the elements and their positions in a linked list.
public class LinkedList_11 {
    public static void main(String[] args) {
        LinkedList<String> lls = new LinkedList<>();
        lls.add("Red");
        lls.add("Blue");
        lls.add("White");
        lls.add("Green");
        System.out.println(lls);
        for (int i=0;i<lls.size();i++){
            System.out.println("Element at index "+i+"- "+lls.get(i) );
        }
    }
}
