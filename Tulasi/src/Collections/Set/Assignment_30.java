package Collections.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

//Can we use list-iterator to iterate data in set implemented classes?
//-No,It is only applicable for List collection implemented classes like ArrayList, LinkedList, etc. It provides bi-directional iteration. ListIterator must be used when we want to enumerate elements of List. This cursor has more functionality(methods) than iterator. ListIterator object can be created by calling listIterator() method present in the List interface.

public class Assignment_30 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        System.out.print("Original contents of al: ");
        //Using iterator
        Iterator itr = al.iterator();
        while(itr.hasNext()) {
            System.out.print( itr.next() + " ");
        }
        System.out.println();

        // Using List Iterator
        ListIterator litr = al.listIterator();

        while(litr.hasNext()) {
            System.out.print( litr.next() + " ");
        }
        System.out.println();
        HashSet<String> set=new HashSet<String>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        // ListIterator litr1 = set.listIterator();

       // while(litr1.hasNext()) {
         //   System.out.print( litr1.next() + " ");
      //  }

    }
}
