package Collections;

import java.util.Iterator;
import java.util.LinkedList;

//Write a Java program to iterate through all elements in a linked list.
public class LinkedList_2 {
    public static void main(String[] args) {
        LinkedList<String> lls=new LinkedList<>();
        lls.add("Red");
        lls.add("Blue");
        lls.add("White");
        lls.add("Green");

        for(String element:lls){
            System.out.println(element);
        }
    }
}
