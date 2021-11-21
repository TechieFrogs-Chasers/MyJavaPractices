package Collections;

import java.util.TreeMap;

//Write a Java program to copy a Tree Map content to another Tree Map.
public class TreeMap_2 {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap_obj=new TreeMap<>();

        treeMap_obj.put(11,"Green");
        treeMap_obj.put(22,"Blue");
        treeMap_obj.put(33,"Red");
        treeMap_obj.put(44,"White");
        treeMap_obj.put(55,"Black");
        System.out.println("First treemap -"+ treeMap_obj);

        TreeMap<Integer,String> treeMap_obj1=new TreeMap<>();

        treeMap_obj1.put(66,"Pink");
        treeMap_obj1.put(77,"Orange");
        System.out.println("Second treemap -"+ treeMap_obj1);

        treeMap_obj.putAll(treeMap_obj1);
        System.out.println("Coping a Tree Map content to another Tree Map-"+treeMap_obj );

    }
}
