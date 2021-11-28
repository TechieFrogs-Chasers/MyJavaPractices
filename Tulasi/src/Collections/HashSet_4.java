package Collections;

import java.util.HashSet;

// Write a Java program to empty an hash set.
public class HashSet_4 {
    public static void main(String[] args) {
        HashSet<String> h_set = new HashSet<>();
        h_set.add("Red");
        h_set.add("Blue");
        h_set.add("White");
        h_set.add("Green");
        h_set.add("Pink");
        h_set.add("Yellow");
        System.out.println("Original hashset elements- \n"+h_set);
        //h_set.clear();
        h_set.removeAll(h_set);
        System.out.println("After empty an hash set-"+h_set);
    }
}
