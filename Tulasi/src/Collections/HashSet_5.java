package Collections;
//Write a Java program to test a hash set is empty or not.
import java.util.HashSet;

public class HashSet_5 {
    public static void main(String[] args) {
        HashSet<String> h_set = new HashSet<>();
        h_set.add("Red");
        h_set.add("Blue");
        h_set.add("White");
        h_set.add("Green");
        h_set.add("Pink");
        h_set.add("Yellow");
        System.out.println("Original hashset elements- \n" + h_set);
        h_set.clear();
        System.out.println(h_set);
        System.out.println(h_set.isEmpty());

    }
}
