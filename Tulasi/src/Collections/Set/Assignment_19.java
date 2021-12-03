package Collections.Set;

import java.util.HashSet;
import java.util.TreeSet;

//How to remove all elements of TreeSet or HashSet at a time?
public class Assignment_19 {
    public static void main(String[] args) {
        //TreeSet
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(11);
        ts.add(22);
        ts.add(33);
        ts.add(44);
        ts.add(55);
        System.out.println("Original set: "+ ts);
        ts.clear();
        System.out.println("Remove all elements of TreeSet: "+ts);

        //HashSet
        HashSet<String> hs=new HashSet<String>();
        hs.add("B");
        hs.add("L");
        hs.add("U");
        hs.add("E");
        hs.add("G");
        System.out.println("Original set: "+ hs);
        hs.clear();
        System.out.println("Remove all elements of HashSet: "+hs);


    }
}
