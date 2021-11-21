package Collections;

import java.util.Map;
import java.util.TreeMap;

//Write a Java program to associate the specified value with the specified key in a Tree Map.
public class TreeMap_1 {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap_obj=new TreeMap<>();

        treeMap_obj.put(11,"Green");
        treeMap_obj.put(22,"Blue");
        treeMap_obj.put(33,"Red");
        treeMap_obj.put(44,"White");
        treeMap_obj.put(55,"Black");
        System.out.println("The specified value with the specified key in a Tree Map-");

        for (Map.Entry treemap: treeMap_obj.entrySet()){
        System.out.println(treemap.getKey()+ "=>"+treemap.getValue());
        }
    }
}
