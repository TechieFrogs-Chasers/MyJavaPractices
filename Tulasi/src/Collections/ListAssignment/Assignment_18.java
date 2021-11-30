package Collections.ListAssignment;

import java.util.ArrayList;

//18.WAP to get particular element from given Array List?
public class Assignment_18 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("Red");
        al.add("Green");
        al.add("Blue");
        al.add("Black");
        System.out.println("Orignial elements list: "+al);
        String s=al.get(1);
        System.out.println("To get particular element from given Array List- "+s);


    }
}
