package Collections;

import java.util.TreeMap;

//Write a Java program to get NavigableSet view of the keys contained in a map.
public class TreeMap_18 {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap_obj=new TreeMap<>();
        treeMap_obj.put(1,"Black");
        treeMap_obj.put(2,"White");
        treeMap_obj.put(3,"Pink");
        treeMap_obj.put(4,"Blue");
        treeMap_obj.put(5,"Green");
        System.out.println("Original treemap: "+treeMap_obj);
        System.out.println("NavigableSet view of the keys contained in a map: "+treeMap_obj.navigableKeySet());
    }
}
