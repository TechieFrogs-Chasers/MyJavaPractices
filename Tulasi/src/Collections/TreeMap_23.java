package Collections;

import java.util.TreeMap;

//Write a Java program to get a portion of a map whose keys are greater than or equal to a given key
public class TreeMap_23 {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap_obj=new TreeMap<>();
        treeMap_obj.put(1,"Black");
        treeMap_obj.put(2,"White");
        treeMap_obj.put(3,"Pink");
        treeMap_obj.put(4,"Blue");
        treeMap_obj.put(5,"Green");
        System.out.println("Original treemap: "+treeMap_obj);
        System.out.println("keys are greater than or equal to a given key-"+treeMap_obj.tailMap(4));


    }
}
