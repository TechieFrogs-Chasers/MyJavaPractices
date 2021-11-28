package Collections;

import java.util.TreeSet;

//Write a Java program to clone a tree set list to another tree set.
public class TreeSet_6 {
    public static void main(String[] args) {
        TreeSet<String> t_Set=new TreeSet<>();
        t_Set.add("Red");
        t_Set.add("Blue");
        t_Set.add("White");
        t_Set.add("Green");
        t_Set.add("Pink");
        t_Set.add("Yellow");
        System.out.println("Original treeset elements- \n"+t_Set);
        t_Set.clone();
        System.out.println("Cloned treeset elements -\n"+t_Set);
    }

}
