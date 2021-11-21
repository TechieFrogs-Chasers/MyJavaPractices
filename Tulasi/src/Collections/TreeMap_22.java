package Collections;

import java.util.TreeMap;

//Write a Java program to get the portion of a map whose keys range from a given key to another key.
public class TreeMap_22 {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap_obj=new TreeMap<>();
        treeMap_obj.put(1,"Black");
        treeMap_obj.put(2,"White");
        treeMap_obj.put(3,"Pink");
        treeMap_obj.put(4,"Blue");
        treeMap_obj.put(5,"Green");
        System.out.println("Original treemap: "+treeMap_obj);
        System.out.println(treeMap_obj.subMap(2,true,6,true));

    }
}
