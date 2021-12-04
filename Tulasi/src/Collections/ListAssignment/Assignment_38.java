package Collections.ListAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

//38.How to merge 2 sorted Linked Lists?
public class Assignment_38 {
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
        System.out.println("Original elements list 1: " + ll);
        Collections.sort(ll);
        System.out.println("After sorting list1: "+ll);
        LinkedList<Integer> lli = new LinkedList<>();
        lli.add(3);
        lli.add(1);
        lli.add(5);
        lli.add(2);
        lli.add(7);
        lli.add(2);
        lli.add(5);
        lli.add(9);
        lli.add(1);
        lli.add(6);
        System.out.println("Original elements list 2: " + lli);
        Collections.sort(lli);
        System.out.println("After sorting list2: "+lli);
        ll.addAll(lli);
        System.out.println("After mergering 2 linked lists: "+ll);
        Collections.sort(ll);
        System.out.println("After mergering 2 linked lists and sorting: "+ll);
    }

}
