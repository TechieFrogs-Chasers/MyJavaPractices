package Collections.Set;

import java.util.HashSet;
import java.util.TreeSet;

//How to find number of elements present in TreeSet?
public class Assignment_16 {
    public static void main(String[] args) {
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(11);
        ts.add(22);
        ts.add(33);
        ts.add(44);
        ts.add(55);
        System.out.println("Original set1: "+ ts);
        System.out.println("Number of elements present in TreeSet: "+ts.size());

    }
}
