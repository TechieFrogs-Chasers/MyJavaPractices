package Collections.ListAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//How to synchronize an Array List in java?
public class Assignment_30 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(3);
        al.add(1);
        al.add(5);
        al.add(7);
        al.add(9);
        al.add(0);
        al.add(3);
        al.add(3);
        al.add(8);
        al.add(2);

        Collections.synchronizedList(al);
        Iterator<Integer> it = al.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
