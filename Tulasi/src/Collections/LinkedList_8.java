package Collections;
//Write a Java program to insert the specified element at the end of a linked list.
import java.util.LinkedList;

public class LinkedList_8 {
    public static void main(String[] args) {
        LinkedList<String> lls = new LinkedList<>();
        lls.add("Red");
        lls.add("Blue");
        lls.add("White");
        lls.add("Green");
        System.out.println(lls);
        lls.offerLast("Pink");
        System.out.println(lls);
    }
}
