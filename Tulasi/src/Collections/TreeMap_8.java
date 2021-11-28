package Collections;

import java.util.TreeMap;

// Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map.
public class TreeMap_8 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap_obj = new TreeMap<>();
        treeMap_obj.put(11, "Green");
        treeMap_obj.put(2, "Blue");
        treeMap_obj.put(33, "Red");
        treeMap_obj.put(4, "White");
        treeMap_obj.put(1, "Black");
        System.out.println("Treemap values -" + treeMap_obj);

        System.out.println("Greater key-value: "+treeMap_obj.firstEntry());
        System.out.println("Greater key-value: "+treeMap_obj.lastEntry());
    }
}
