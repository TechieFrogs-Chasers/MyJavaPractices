package Collections;

import java.util.TreeSet;

//Write a Java program to get the number of elements in a tree set.
public class TreeSet_7 {
    public static void main(String[] args) {
        TreeSet<String> t_Set=new TreeSet<>();
        t_Set.add("Red");
        t_Set.add("Blue");
        t_Set.add("White");
        t_Set.add("Green");
        t_Set.add("Pink");
        t_Set.add("Yellow");
        System.out.println("Original treeset elements- \n"+t_Set);
        System.out.println("Number of elements in a treeset-"+t_Set.size() );
    }
}
