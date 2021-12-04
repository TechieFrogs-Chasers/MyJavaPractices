package Collections.ListAssignment;

import java.util.ArrayList;

//9.WAP to replace particular element in given Array List?
public class Assignment_9 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("Red");
        al.add("Green");
        al.add("Blue");
        al.add("Black");
        System.out.println("Original elements: "+al);
        al.set(2,"White");
        System.out.println("After replacing particular element in given Array List-"+al);
    }
}
