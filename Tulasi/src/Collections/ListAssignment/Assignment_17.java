package Collections.ListAssignment;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

//17.WAP to prove whether iterator in Array List/Vector/Linked List is fail-safe or fail-fast?
public class Assignment_17 {
    public static void main(String[] args) {
        //Iterator in Array List/Vector/Linked List is fail-safe
        List<String> l=new CopyOnWriteArrayList<>();
        l.add("Red");
        l.add("Green");
        l.add("Blue");
        l.add("Black");
        System.out.println("Orignial elements for fail-safe: ");
        Iterator<String> it=l.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("Iterator in Array List/Vector/Linked List is fail-safe-");
        l.add("Pink");
        System.out.println(l);
        System.out.println();
        //Iterator in Array List/Vector/Linked List is fail-fast
        //ArrayList
        ArrayList<String> al=new ArrayList<>();
        al.add("Red");
        al.add("Green");
        al.add("Blue");
        al.add("Black");
        System.out.println("Orignial elements for fail-fast for ArrayList: ");
        Iterator<String> i=al.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("Iterator in Array List for fail-fast-");
        al.add("Pink");
        System.out.println(al);
        System.out.println();
        //Vector
        Vector<String> vec=new Vector<>();
        vec.add("Red");
        vec.add("Green");
        vec.add("Blue");
        vec.add("Black");
        System.out.println("Orignial elements for fail-fast for Vector: ");
        Iterator<String> itl=vec.iterator();
        while (itl.hasNext()) {
            System.out.println(itl.next());
        }
        System.out.println("Iterator in Vector for fail-fast-");
        vec.add("Pink");
        System.out.println(vec);
        System.out.println();
           //Linked List
        LinkedList<String> lls=new LinkedList<>();
        lls.add("Red");
        lls.add("White");
        lls.add("Brown");
        lls.add("orange");
        System.out.println("Orignial elements for fail-fast for LinkedList: ");
        Iterator<String> il=lls.iterator();
        while (il.hasNext()) {
            System.out.println(il.next());
        }
        System.out.println("Iterator in LinkedList for fail-fast-");
        lls.add("Pink");
        System.out.println(lls);


    }


}
