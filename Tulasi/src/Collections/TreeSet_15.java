package Collections;

import java.util.TreeSet;

//Write a Java program to retrieve and remove the last element of a tree set.
public class TreeSet_15 {
    public static void main(String[] args) {
        TreeSet<Integer> t_set=new TreeSet<>();
        t_set.add(82);
        t_set.add(45);
        t_set.add(88);
        t_set.add(75);
        t_set.add(99);
        System.out.println("Original treeset elements- \n"+t_set);

        System.out.println("Last(Higher) element-"+ t_set.pollLast());
        System.out.println("After retrieve and remove the Last element of a treeset-"+ t_set);
    }
}
