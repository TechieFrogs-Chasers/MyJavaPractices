package Collections.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//27.How to implement generics for Set implemented classes with an example?
public class Assignment_27 {
    public static void main(String[] args) {
            Set<Integer> s = new HashSet<>();
            //add element to generic
            Integer i = 77;
            s.add(i);
            System.out.println(i);
            //Iterator
            Iterator<Integer> it = s.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
            //for loop
            for (Integer l : s) {
                System.out.println(l);
            }
    }
}
