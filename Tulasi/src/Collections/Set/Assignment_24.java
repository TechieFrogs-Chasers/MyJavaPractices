package Collections.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

//Give an example when will get ConcurrentModificationException in Hash Set or Tree Set or Linked Hash Set?--fail-fast
public class Assignment_24 {
    public static void main(String[] args) {
        //HashSet
        HashSet<Integer> hs=new HashSet<>();
        hs.add(11);
        hs.add(22);
        hs.add(33);
        hs.add(44);
        hs.add(55);
        Iterator <Integer> i=hs.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
            hs.add(66);
        }
        //TreeSet
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(11);
        ts.add(22);
        ts.add(33);
        ts.add(44);
        ts.add(55);
        Iterator<Integer> it=ts.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
            ts.remove(44);
        }
        //LinkedHashSet
        LinkedList<Integer> lls=new LinkedList<>();
        lls.add(11);
        lls.add(22);
        lls.add(33);
        lls.add(44);
        lls.add(55);
        Iterator<Integer> its=lls.iterator();
        while (its.hasNext()){
            System.out.println(its.next());
            lls.add(66);
        }
    }
}
