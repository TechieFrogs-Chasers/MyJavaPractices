package Collections;

import java.util.Iterator;
import java.util.LinkedList;

//Write a Java program to iterate through all elements in a linked list starting at the specified position.
public class LinkedList_3 {
    public static void main(String[] args) {
        LinkedList<String> lls=new LinkedList<>();
        lls.add("Red");
        lls.add("Blue");
        lls.add("White");
        lls.add("Green");

        Iterator itr=lls.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
