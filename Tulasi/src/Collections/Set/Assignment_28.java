package Collections.Set;

import java.util.*;

//List down methods to make collection thread-safe with an examples?
public class Assignment_28 {
    public static void main(String[] args) {
        //Collection -List thread safe
        //ArrayList
        List<Integer> l=new ArrayList<>();
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        Collections.synchronizedList(l);
        l.add(6);
        System.out.println(l);
        //Vector
        List<Integer> v=new Vector<>();
        v.add(4);
        v.add(5);
        v.add(6);
        Collections.synchronizedList(v);
        v.add(7);
        System.out.println(v);
        //LinkedList
        List<Integer> ll=new LinkedList<>();
        ll.add(7);
        ll.add(8);
        ll.add(9);
        Collections.synchronizedList(ll);
        ll.add(10);
        System.out.println(ll);

        //Collections-Set thread safe
        //HashSet
        Set<Integer> sh=new HashSet<>();
        sh.add(11);
        sh.add(12);
        sh.add(13);
        Collections.synchronizedSet(sh);
        sh.add(14);
        System.out.println(sh);
        //LinkedHashSet
        Set<Integer> lhs=new LinkedHashSet<>();
        lhs.add(15);
        lhs.add(16);
        lhs.add(17);
        Collections.synchronizedSet(lhs);
        lhs.add(18);
        System.out.println(lhs);
        //Treeset
        Set<Integer> ts=new TreeSet<>();
        ts.add(19);
        ts.add(20);
        ts.add(21);
        Collections.synchronizedSet(ts);
        ts.add(22);
        System.out.println(ts);

    }
}
