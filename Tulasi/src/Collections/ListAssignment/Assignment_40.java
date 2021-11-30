package Collections.ListAssignment;

import java.util.ArrayList;

//WAP to get sublist from Array List in Java?
public class Assignment_40 {
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
        ArrayList<Integer> sublist = new ArrayList<>(al.subList(3,7));
        System.out.println("Sublist from Array List: "+sublist);
    }
}
