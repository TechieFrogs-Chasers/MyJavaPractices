package Collections.ListAssignment;

import java.util.ArrayList;

//8.WAP to check particular element exist or not?
public class Assignment_8 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("Red");
        al.add("Green");
        al.add("Blue");
        al.add("Black");
        System.out.println("Orignial elements: "+al);
        boolean exist=al.contains("Blue");
        System.out.println("After checking particular element Blue exist or not-"+exist);
        boolean exists=al.contains("White");
        System.out.println("After checking particular element White exist or not-"+exists);

    }
}
