package Collections.ListAssignment;

import java.util.ArrayList;

//3.WAP to remove particular element from Array List?
public class Assignment_3 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("Red");
        al.add("Green");
        al.add("Blue");
        al.add("Black");
        System.out.println("Orignial elements: "+al);
        al.remove("Red");//removing particular object.
        al.remove(1);//remove particular index.
        System.out.println("After removing particular element from ArrayList-"+al);
    }
}
