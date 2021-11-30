package Collections.ListAssignment;

import java.util.ArrayList;

//25.How do you decrease the current capacity of an Array List to the current size?
public class Assignment_25 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("Red");
        al.add("Green");
        al.add("Blue");
        al.add("Black");
        System.out.println("Orignial elements: "+al);
        al.trimToSize();
        System.out.println("Decrease the current capacity of an Array List to the current size-"+al);
    }
}
