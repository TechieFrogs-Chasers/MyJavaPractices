package Collections;

import java.util.Collections;
import java.util.HashSet;

//Write a Java program to clone a hash set to another hash set.
public class HashSet_6 {
    public static void main(String[] args) {
        HashSet<String> h_set = new HashSet<>();
        h_set.add("Red");
        h_set.add("Blue");
        h_set.add("White");
        h_set.add("Green");
        h_set.add("Pink");
        h_set.add("Yellow");
        System.out.println("Original hashset elements- \n" + h_set);
        h_set.clone();
        System.out.println("After clone the hashset elements -\n"+h_set);
    }
}
