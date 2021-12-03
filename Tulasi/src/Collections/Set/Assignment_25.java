package Collections.Set;

import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;

//How to avoid ConcurrentModificationException with an example?--fail-safe
public class Assignment_25 {
    public static void main(String[] args) {

        Set<Integer> s=new CopyOnWriteArraySet <Integer>();
        s.add(11);
        s.add(22);
        s.add(33);
        s.add(44);
        s.add(55);
        Iterator<Integer> i=s.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
            s.add(66);
        }
    }
}
