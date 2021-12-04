package Collections.ListAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//27.How do you append an element at the end of an Array List?
public class Assignment_27 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("Red");
        al.add("Green");
        al.add("Blue");
        al.add("Black");
        System.out.println("Orignial elements: "+al);
        al.add("White");
        al.add("Pink");
        System.out.println("Append an element at the end of an Array List:"+al);
    }
}
