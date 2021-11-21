package Collections;

import java.util.TreeMap;

//Write a Java program to sort keys in Tree Map by using comparator.
public class TreeMap_7 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap_obj = new TreeMap<>();

        treeMap_obj.put(11, "Green");
        treeMap_obj.put(2, "Blue");
        treeMap_obj.put(33, "Red");
        treeMap_obj.put(4, "White");
        treeMap_obj.put(1, "Black");
        System.out.println("Treemap values -" + treeMap_obj);
        treeMap_obj.comparator();
        System.out.println("After sorting keys in tree map by using comparator- "+treeMap_obj);
    }
}
