package Collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//Write a Java program to get all keys from the given a Tree Map.
public class TreeMap_5 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap_obj = new TreeMap<>();

        treeMap_obj.put(11, "Green");
        treeMap_obj.put(22, "Blue");
        treeMap_obj.put(33, "Red");
        treeMap_obj.put(44, "White");
        treeMap_obj.put(55, "Black");
        System.out.println("Treemap values -" + treeMap_obj);

        Set<Integer> setvalue = treeMap_obj.keySet();
        for (Integer keys : treeMap_obj.keySet()) {
            System.out.println(keys);
        }
    }
}
