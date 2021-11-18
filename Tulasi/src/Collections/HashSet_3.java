package Collections;
// Write a Java program to get the number of elements in a hash set.
import java.util.Collections;
import java.util.HashSet;

public class HashSet_3 {
    public static void main(String[] args) {
        HashSet<String> h_set = new HashSet<>();
        h_set.add("Red");
        h_set.add("Blue");
        h_set.add("White");
        h_set.add("Green");
        h_set.add("Pink");
        h_set.add("Yellow");
        System.out.println("Original hashset elements- \n"+h_set);
        System.out.println("Number of elements in a hashset- \n"+h_set.size());//to check number of elements use size()
    }
}
