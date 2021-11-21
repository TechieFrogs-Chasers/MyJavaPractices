package Collections;

import java.util.TreeMap;

//Write a Java program to delete all elements from a given Tree Map
public class TreeMap_6 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap_obj = new TreeMap<>();

        treeMap_obj.put(11, "Green");
        treeMap_obj.put(22, "Blue");
        treeMap_obj.put(33, "Red");
        treeMap_obj.put(44, "White");
        treeMap_obj.put(55, "Black");
        System.out.println("Treemap values -" + treeMap_obj);

        treeMap_obj.clear();
        System.out.println("After deleting all elements: "+treeMap_obj);

    }
}
