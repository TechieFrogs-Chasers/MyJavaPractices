package Collections.ListAssignment;

import java.util.ArrayList;

//5.WAP to remove all elements of an Array List at a time?
public class Assignment_5 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("Red");
        al.add("Green");
        al.add("Blue");
        al.add("Black");
        System.out.println("Original elements: "+al);
        al.removeAll(al);
        System.out.println("After removing all elements of an Array List at a time-"+al);
    }
}
