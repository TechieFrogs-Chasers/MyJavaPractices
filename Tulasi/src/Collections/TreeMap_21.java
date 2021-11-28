package Collections;

import java.util.TreeMap;

//Write a Java program to get the portion of a map whose keys range from a given key (inclusive), to another key (exclusive).
public class TreeMap_21 {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap_obj=new TreeMap<>();
        treeMap_obj.put(1,"Black");
        treeMap_obj.put(2,"White");
        treeMap_obj.put(3,"Pink");
        treeMap_obj.put(4,"Blue");
        treeMap_obj.put(5,"Green");
        System.out.println("Original treemap: "+treeMap_obj);
        System.out.println(" keys range from a given key (inclusive), to another key (exclusive)-"+treeMap_obj.subMap(2,5));

    }
}