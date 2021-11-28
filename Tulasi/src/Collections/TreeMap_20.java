package Collections;

import java.util.TreeMap;

//Write a Java program to remove and get a key-value mapping associated with the greatest key in this map.
public class TreeMap_20 {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap_obj=new TreeMap<>();
        treeMap_obj.put(1,"Black");
        treeMap_obj.put(2,"White");
        treeMap_obj.put(3,"Pink");
        treeMap_obj.put(4,"Blue");
        treeMap_obj.put(5,"Green");
        System.out.println("Original treemap: "+treeMap_obj);
        System.out.println("To remove and get a key-value mapping associated with the greatest key in a map-"+treeMap_obj.pollLastEntry());
        System.out.println("After remove and get a key-value mapping associated with the greatest  key in a map-"+treeMap_obj);
    }
}
