package Collections.ListAssignment;

import java.util.ArrayList;
import java.util.Collections;

//11.WAP to copy one array list to another array list?
public class Assignment_11 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("Red");
        al.add("Green");
        al.add("Blue");
        al.add("Black");
        System.out.println("Orignial elements list1: "+al);

        ArrayList<String> allist=new ArrayList<>(al);//Passing in the constructor
        System.out.println("After coping one array list to another array list-"+allist);

    }
}
