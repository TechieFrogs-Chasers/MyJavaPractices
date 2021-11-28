package Collections;
//Write a Java program to create a reverse order view of the elements contained in a given tree set.
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_4 {
    public static void main(String[] args) {
        TreeSet<String> t_Set=new TreeSet<>();
        t_Set.add("Red");
        t_Set.add("Blue");
        t_Set.add("White");
        t_Set.add("Green");
        t_Set.add("Pink");
        t_Set.add("Yellow");
        System.out.println("Original treeset elements- \n"+t_Set);
        System.out.println();
        Iterator<String> itr=t_Set.descendingIterator();
        System.out.println("Elements in reverse order : ");
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
