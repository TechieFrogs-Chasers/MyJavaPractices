package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//Write a Java program to convert a hash set to a tree set.
public class HashSet_8 {
    public static void main(String[] args) {
        HashSet<String> h_set = new HashSet<>();
        h_set.add("Red");
        h_set.add("Blue");
        h_set.add("White");
        h_set.add("Green");
        h_set.add("Pink");
        h_set.add("Yellow");
        System.out.println("Original hashset elements- \n" + h_set);
        Set<String> set_tree=new TreeSet<String>(h_set);

        for (String tree:set_tree){
            System.out.println(tree);
        }
    }
}
