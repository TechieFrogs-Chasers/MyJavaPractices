package Collections.ListAssignment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

//15.WAP to convert Array List to Linked List or vice-versa?
public class Assignment_15 {
    public static void main(String[] args) {
        //Converting Array List to Linked List
        ArrayList<String> al=new ArrayList<>();
        al.add("Red");
        al.add("Green");
        al.add("Blue");
        al.add("Black");
        System.out.println("Original elements list: "+al);
        LinkedList<String> ll=new LinkedList<>(al);
        System.out.println("Converting Array List to Linked List-"+ll);

        // Converting Linked List to Array List
        LinkedList<String> lls=new LinkedList<>();
        lls.add("Pink");
        lls.add("White");
        lls.add("Brown");
        lls.add("orange");
        System.out.println("Original elements list1: "+lls);
        ArrayList<String> als=new ArrayList<>(lls);
        System.out.println("Converting Linked List to Array List-"+als);
    }
}
