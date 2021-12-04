package Collections.ListAssignment;

import java.util.ArrayList;
import java.util.Collections;

//6.WAP to reverse Array List?
public class Assignment_6 {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(3);
        al.add(1);
        al.add(5);
        al.add(7);
        al.add(9);
        al.add(0);
        al.add(3);
        al.add(3);
        al.add(8);
        al.add(2);
        System.out.println("Original elements: " + al);
        Collections.reverse(al);
        System.out.println("After reversing Array List-"+al);

    }
}
