package Collections;
//Write a Java program to add all the elements of a specified tree set to another tree set.
import java.util.TreeSet;

public class TreeSet_3 {
    public static void main(String[] args) {
        TreeSet<String> t_Set=new TreeSet<>();
        t_Set.add("Red");
        t_Set.add("Blue");
        t_Set.add("White");

        System.out.println("First treeset elements- \n"+t_Set);

        TreeSet<String> t_Set1=new TreeSet<>();
        t_Set1.add("Green");
        t_Set1.add("Pink");
        t_Set1.add("Yellow");
        System.out.println("Second treeset elements- \n"+t_Set1);

        t_Set.addAll(t_Set1);
        System.out.println("After adding two set of treesets -\n"+t_Set);
    }
}
