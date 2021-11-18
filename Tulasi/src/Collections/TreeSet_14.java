package Collections;

import java.util.Collections;
import java.util.TreeSet;

// Write a Java program to retrieve and remove the first element of a tree set.
public class TreeSet_14 {
    public static void main(String[] args) {
        TreeSet<Integer> t_set=new TreeSet<>();
        t_set.add(82);
        t_set.add(45);
        t_set.add(88);
        t_set.add(75);
        t_set.add(99);
        System.out.println("Original treeset elements- \n"+t_set);

        System.out.println("First(lowest) element-"+ t_set.pollFirst());
        System.out.println("After retrieve and remove the first element of a treeset-"+ t_set);
    }
}
