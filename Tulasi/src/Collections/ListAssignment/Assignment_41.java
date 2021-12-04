package Collections.ListAssignment;

import java.util.ArrayList;

//41.WAP to find 3rd element from end in a linked list in one pass?
public class Assignment_41 {
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
        System.out.println("Original elements list: "+al);
        System.out.println(al.size());
        System.out.println(al.get(al.size()-3));
    }
}
