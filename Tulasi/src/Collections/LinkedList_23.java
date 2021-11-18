package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Write a Java program to convert a linked list to array list.
public class LinkedList_23 {
    public static void main(String[] args) {
        LinkedList<String> lls = new LinkedList<>();
        lls.add("Red");
        lls.add("Blue");
        lls.add("White");
        lls.add("Green");
        System.out.println(lls);

        List<String> Linked_ArrayList=new ArrayList<String>(lls);

        for(String all:lls){
            System.out.println(all);
        }
    }
}
