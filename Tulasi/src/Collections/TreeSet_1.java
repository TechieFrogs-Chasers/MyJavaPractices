package Collections;

import java.util.TreeSet;

//Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
public class TreeSet_1 {
    public static void main(String[] args) {//TreeSet dont allow random access
        TreeSet<String> t_Set=new TreeSet<>();
        t_Set.add("Red");
        t_Set.add("Blue");
        t_Set.add("White");
        t_Set.add("Green");
        t_Set.add("Pink");
        t_Set.add("Yellow");
        System.out.println("Original treeset elements- \n"+t_Set);
    }
}
