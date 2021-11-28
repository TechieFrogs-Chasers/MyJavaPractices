package Collections;

import java.util.TreeSet;

// Write a Java program to remove a given element from a tree set.
public class TreeSet_16 {
    public static void main(String[] args) {
        TreeSet<Integer> t_set=new TreeSet<>();
        t_set.add(82);
        t_set.add(45);
        t_set.add(88);
        t_set.add(75);
        t_set.add(99);
        System.out.println("Original treeset elements- \n"+t_set);

        System.out.println("Remove given element-"+ t_set.remove(88));
        System.out.println("After removing given element of a treeset-"+ t_set);
    }

}
