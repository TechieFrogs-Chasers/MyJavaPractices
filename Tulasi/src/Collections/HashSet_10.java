package Collections;
//Write a Java program to compare two hash set.

import java.util.ArrayList;
import java.util.HashSet;

public class HashSet_10 {
    public static void main(String[] args) {
        HashSet<String> h_set = new HashSet<>();
        h_set.add("Red");
        h_set.add("Blue");
        h_set.add("White");
        h_set.add("Green");
        h_set.add("Pink");
        h_set.add("Yellow");
        System.out.println("Original hashset elements- \n" + h_set);

        HashSet<String> h_set1 = new HashSet<>();
        h_set1.add("Dark");
        h_set1.add("Blue");
        h_set1.add("Bright");
        h_set1.add("Green");
        System.out.println("Hashset List2-"+h_set1);

        for (String element: h_set){
            System.out.println(h_set1.contains(element)?"Yes":"No");
        }
    }
}
