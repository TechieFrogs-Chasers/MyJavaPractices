package Collections.Set;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

//23.How to make HashSet/LinkedHashSet/TreeSet as thread safe?
public class Assignment_23 {
    public static void main(String[] args) {
        //HashSet
        HashSet<Integer> hs=new HashSet<>();
        hs.add(11);
        hs.add(22);
        hs.add(33);
        hs.add(44);
        hs.add(55);

        System.out.println("Original set: "+ hs);
        Collections.synchronizedSet (hs);
        System.out.println("HashSet as thread safe: "+hs);

        //TreeSet
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(11);
        ts.add(22);
        ts.add(33);
        ts.add(44);
        ts.add(55);

        System.out.println("Original set: "+ ts);
        Collections.synchronizedSet (ts);
        System.out.println("TreeSet as thread safe: "+ts);

        //LinkedHashSet
        LinkedList<Integer> lls=new LinkedList<>();
        lls.add(11);
        lls.add(22);
        lls.add(33);
        lls.add(44);
        lls.add(55);

        System.out.println("Original set: "+ lls);
         //Collections.synchronizedSet (new LinkedList<>(lls));
        System.out.println("LinkedHashSet as thread safe: "+lls);
    }
}
