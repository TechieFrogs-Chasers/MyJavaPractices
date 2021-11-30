package Collections.ListAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

//How do you sort Linked List in java?
public class Assignment_37 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(3);
        ll.add(1);
        ll.add(5);
        ll.add(7);
        ll.add(9);
        ll.add(0);
        ll.add(3);
        ll.add(3);
        ll.add(8);
        ll.add(2);
        System.out.println("Orignial elements list : " + ll);
        Collections.sort(ll);
        System.out.println("After sorting list: "+ll);
    }
}
