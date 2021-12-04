package Collections.Set;

import java.util.TreeSet;

//20.Can we add null element in TreeSet?
public class Assignment_20 {
    public static void main(String[] args) {
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(11);
        ts.add(22);
        ts.add(33);
        ts.add(44);
        ts.add(55);
        ts.add(null);//TreeSet doesnot allow null keys.
        System.out.println("Original set: "+ ts);
    }
}
