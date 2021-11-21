package Collections;

import java.util.Set;
import java.util.TreeMap;

// Write a Java program to search a key in a Tree Map.
public class TreeMap_3 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap_obj = new TreeMap<>();

        treeMap_obj.put(11, "Green");
        treeMap_obj.put(22, "Blue");
        treeMap_obj.put(33, "Red");
        treeMap_obj.put(44, "White");
        treeMap_obj.put(55, "Black");
        System.out.println("Treemap values -" + treeMap_obj);

        if (treeMap_obj.containsKey(22)) {
            System.out.println("Key exists!");
        } else {
            System.out.println("Key doesnot exists!");
        }
        if (treeMap_obj.containsKey(66)) {
            System.out.println("Key exists!");
        } else {
            System.out.println("Key doesnot exists!");
        }
    }
}
