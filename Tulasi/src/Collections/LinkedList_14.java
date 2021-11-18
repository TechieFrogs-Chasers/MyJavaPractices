package Collections;

import java.util.LinkedList;

//Write a Java program to remove all the elements from a linked list.
public class LinkedList_14 {
    public static void main(String[] args) {
        LinkedList<String> lls = new LinkedList<>();
        lls.add("Red");
        lls.add("Blue");
        lls.add("White");
        lls.add("Green");
        System.out.println(lls);
        //lls.removeAll(lls);
        lls.clear();
        System.out.println(lls);
    }
}
