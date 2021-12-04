package Collections.Set;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

//31.Can we add multiple null’s in set implemented classes? If yes prove with an example?
//No,Set implemented classes doesnot allow multiple null values.HashSet and LinkedHashSet allows only one null value,TreeSet does not allows null values
public class Assignment_31 {
    public static void main(String[] args) {
        //HashSet
        HashSet<Integer> hs=new HashSet<>();
        hs.add(11);
        hs.add(22);
        hs.add(33);
        hs.add(44);
        hs.add(null);
        hs.add(null);
        System.out.println("Original set: "+ hs);
        //TreeSet
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(11);
        ts.add(22);
        ts.add(33);
        ts.add(44);
        ts.add(55);
        ts.add(null);
        ts.add(null);
        System.out.println("Original set: "+ ts);
        //LinkedHashSet
        LinkedList<Integer> lls=new LinkedList<>();
        lls.add(11);
        lls.add(22);
        lls.add(33);
        lls.add(44);
        lls.add(55);
        lls.add(null);
        lls.add(null);
        System.out.println("Original set: "+ lls);
    }
}
