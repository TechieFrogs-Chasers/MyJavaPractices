package Collections;

import java.util.TreeMap;

//Write a Java program to get the least key greater than or equal to the given key. Returns null if there is no such key.
public class TreeMap_26 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap_obj = new TreeMap<>();
        treeMap_obj.put(1, "Black");
        treeMap_obj.put(2, "White");
        treeMap_obj.put(3, "Pink");
        treeMap_obj.put(4, "Blue");
        treeMap_obj.put(5, "Green");
        System.out.println("Original treemap: " + treeMap_obj);
        System.out.println("Keys greater than or equal to 2:-"+ treeMap_obj.ceilingKey(2));
        System.out.println("Keys greater than or equal to 5:-"+ treeMap_obj.ceilingKey(5));
        System.out.println("Keys greater than or equal to 6:-"+ treeMap_obj.ceilingKey(6));

    }
}
