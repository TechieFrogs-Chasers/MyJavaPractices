package Collections.ListAssignment;

import java.util.ArrayList;

//33.WAP to find the length of the Array List?
public class Assignment_33 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("Red");
        al.add("Green");
        al.add("Blue");
        al.add("Black");
        System.out.println("Orignial elements list: "+al);
        int size=al.size();
        System.out.println("The length of the Array List: "+size);
    }
}
