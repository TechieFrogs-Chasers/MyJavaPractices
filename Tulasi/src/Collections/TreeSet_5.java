package Collections;

import java.util.Collections;
import java.util.TreeSet;

//Write a Java program to get the first and last elements in a tree set.
public class TreeSet_5 {

    public static void main(String[] args) {
        TreeSet<String> t_Set=new TreeSet<>();
        t_Set.add("Red");
        t_Set.add("Blue");
        t_Set.add("White");
        t_Set.add("Green");
        t_Set.add("Pink");
        t_Set.add("Yellow");
        System.out.println("Original treeset elements- \n"+t_Set);

        Object first_element=t_Set.first();
        System.out.println("First element in a tree set-"+ first_element);

        Object last_element=t_Set.last();
        System.out.println("Last element in a tree set-"+ last_element);
    }
}
