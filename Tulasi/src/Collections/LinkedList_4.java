package Collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

//Write a Java program to iterate a linked list in reverse order.
public class LinkedList_4 {
    public static void main(String[] args) {
        LinkedList<String> lls=new LinkedList<>();
        lls.add("Red");
        lls.add("Blue");
        lls.add("White");
        lls.add("Green");
        System.out.println(lls);
        //Collections.reverse(lls);
        //System.out.println(lls);
       Iterator itr=lls.descendingIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
