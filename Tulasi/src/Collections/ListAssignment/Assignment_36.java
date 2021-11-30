package Collections.ListAssignment;

import java.util.ArrayList;
import java.util.Collections;

//WAP to Sort Array list Of Strings in Descending Order?
public class Assignment_36 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("K");
        al.add("B");
        al.add("P");
        al.add("R");
        System.out.println("Before Sorting:" + al);
        Collections.sort(al);
        System.out.println(al);
        Collections.sort(al, Collections.reverseOrder());
        System.out.println("ArrayList in descending order:" + al);
    }
}

