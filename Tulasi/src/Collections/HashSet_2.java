package Collections;
// Write a Java program to iterate through all elements in a hash list.
import java.util.HashSet;
import java.util.Iterator;

public class HashSet_2 {
    public static void main(String[] args) {
        HashSet<String> h_set = new HashSet<>();
        h_set.add("Red");
        h_set.add("Blue");
        h_set.add("White");
        h_set.add("Green");
        h_set.add("Pink");
        h_set.add("Yellow");

        Iterator itr=h_set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
