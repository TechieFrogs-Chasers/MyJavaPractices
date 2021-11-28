package Collections;
//Write a Java program to find the numbers less than 7 in a tree set.
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_9 {
    public static void main(String[] args) {
        TreeSet<Integer> t_Set=new TreeSet<>();
        TreeSet<Integer> t_Size=new TreeSet<>();
        t_Set.add(0);
        t_Set.add(1);
        t_Set.add(2);
        t_Set.add(3);
        t_Set.add(4);
        t_Set.add(5);
        t_Set.add(6);
        t_Set.add(7);

        t_Size = (TreeSet)t_Set.headSet(7);

        Iterator itr=t_Size.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
