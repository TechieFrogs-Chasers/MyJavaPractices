package Collections.ListAssignment;

import java.util.ArrayList;
import java.util.Vector;

//14.WAP to convert Array List to Vector or vice-versa?
public class Assignment_14 {
    public static void main(String[] args) {
        // Converting Array List to Vector
        ArrayList<String> al=new ArrayList<>();
        al.add("Red");
        al.add("Green");
        al.add("Blue");
        al.add("Black");
        System.out.println("Original elements list: "+al);
        Vector<String> v=new Vector<>(al);
        System.out.println("Converting Array List to Vector-"+v);

        // Converting Vector to Array List
        Vector<String> vec=new Vector<>();
        vec.add("Pink");
        vec.add("White");
        vec.add("Brown");
        vec.add("orange");
        System.out.println("Original elements list1: "+vec);
        ArrayList<String> als=new ArrayList<>(vec);
        System.out.println("Converting Vector to Array List-"+als);
    }
}
