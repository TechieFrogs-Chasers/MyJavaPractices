package Collections;

import java.util.TreeMap;

//Write a Java program to get the portion of a map whose keys are strictly less than a given key.
public class TreeMap_13 {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap_obj=new TreeMap<>();
        treeMap_obj.put(1,"Black");
        treeMap_obj.put(2,"White");
        treeMap_obj.put(3,"Pink");
        treeMap_obj.put(4,"Blue");
        treeMap_obj.put(5,"Green");
        System.out.println("Original treemap: "+treeMap_obj);
        System.out.println("Check the entry key:2");
        System.out.println("keys: "+treeMap_obj.headMap(2));
        System.out.println("Check the entry key:5");
        System.out.println("keys: "+treeMap_obj.headMap(5));
        System.out.println("Check the entry key:8");
        System.out.println("keys: "+treeMap_obj.headMap(8));
    }
}

