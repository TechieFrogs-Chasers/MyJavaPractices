package Collections.ListAssignment;

import java.util.ArrayList;

//2.	WAP to add element at particular index of Array List?
public class Assignment_2 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("Red");
        al.add("Green");
        al.add("Blue");
        al.add("Black");
        System.out.println("Original elements: "+al);
        al.add(2,"White");
        System.out.println("After adding element at particular index of Array List-"+al);
    }
}
