package Collections.ListAssignment;

import java.util.LinkedList;

//How to add an element at the middle of the linked list?
public class Assignment_39 {
    public static void main(String[] args) {

            LinkedList<Integer> ll = new LinkedList<>();
            ll.add(3);
            ll.add(1);
            ll.add(5);
            ll.add(7);
            ll.add(9);
            ll.add(3);
            ll.add(3);
            ll.add(8);
            ll.add(2);
            System.out.println("Orignial elements list : " + ll);
            Integer middle=ll.get(ll.size()/2);
            System.out.println("To get an middle element: "+middle);
            ll.add(5,0);
            System.out.println("Add an element at the middle of the linked list: "+ll);

    }
}
