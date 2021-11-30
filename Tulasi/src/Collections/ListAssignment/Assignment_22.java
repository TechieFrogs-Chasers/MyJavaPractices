package Collections.ListAssignment;

import java.util.ArrayList;

//WAP to get first occurrence of an element in given Array List?
public class Assignment_22 {
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
        System.out.println("Orignial elements list : " + al);
        System.out.println("First occurrence of an element in given Array List-"+al.get(0));
    }
}
