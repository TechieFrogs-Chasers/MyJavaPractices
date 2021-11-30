package Collections.ListAssignment;

import java.util.ArrayList;

//24.How do you increase the current capacity of an Array List?
public class Assignment_24 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("Red");
        al.add("Green");
        al.add("Blue");
        al.add("Black");
        System.out.println("Orignial elements: "+al);
        System.out.println("Orignial elements size: "+al.size());
        al.ensureCapacity(100);
        System.out.println("Increase the current capacity of an Array List- "+al.size());

    }
}
