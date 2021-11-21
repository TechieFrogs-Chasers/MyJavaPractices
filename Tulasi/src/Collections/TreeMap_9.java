package Collections;

import java.util.TreeMap;

//Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.
public class TreeMap_9 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap_obj = new TreeMap<>();
        treeMap_obj.put(11, "Green");
        treeMap_obj.put(2, "Blue");
        treeMap_obj.put(33, "Red");
        treeMap_obj.put(4, "White");
        treeMap_obj.put(1, "Black");
        System.out.println("Treemap values -" + treeMap_obj);
        System.out.println("First(lowest)key-"+treeMap_obj.firstKey());
        System.out.println("Last(Highest) key-"+treeMap_obj.lastKey());

    }
}
