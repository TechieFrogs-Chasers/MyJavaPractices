package Collections.ListAssignment;

import java.util.ArrayList;
import java.util.Collections;

//35.WAP to sort Array List in ascending order?
public class Assignment_35 {
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
        System.out.println("Orignial elements list: "+al);
        Collections.sort(al);
        System.out.println("Sort Array List in ascending order: "+al);

    }
}
