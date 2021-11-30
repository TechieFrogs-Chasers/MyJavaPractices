package Collections.ListAssignment;

import java.util.LinkedList;
import java.util.Vector;

//16.WAP to convert vector to Linked List or vice-versa?
public class Assignment_16 {
    public static void main(String[] args) {

        //Converting vector to Linked List
        Vector<String> vec=new Vector<>();
        vec.add("Red");
        vec.add("Green");
        vec.add("Blue");
        vec.add("Black");
        System.out.println("Orignial elements list: "+vec);
        LinkedList<String> ll=new LinkedList<>(vec);
        System.out.println("Converting vector to Linked List-"+ll);

        // Converting Linked List to Vector
        LinkedList<String> lls=new LinkedList<>();
        lls.add("Pink");
        lls.add("White");
        lls.add("Brown");
        lls.add("orange");
        System.out.println("Orignial elements list1: "+lls);
        Vector<String> v=new Vector<>(lls);
        System.out.println("Converting Linked List to Vector-"+v);


    }
}
