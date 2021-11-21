package Collections;

import java.util.TreeMap;

//Write a Java program to get the least key strictly greater than the given key. Return null if there is no such key.
public class TreeMap_15 {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap_obj=new TreeMap<>();
        treeMap_obj.put(1,"Black");
        treeMap_obj.put(2,"White");
        treeMap_obj.put(3,"Pink");
        treeMap_obj.put(4,"Blue");
        treeMap_obj.put(5,"Green");
        System.out.println("Original treemap: "+treeMap_obj);
        System.out.println("Keys :2");
        System.out.println("keys:" +treeMap_obj.higherEntry(2));
        System.out.println("Keys :5");
        System.out.println("keys:" +treeMap_obj.higherEntry(4));
        System.out.println("Keys :7");
        System.out.println("keys:" +treeMap_obj.higherEntry(7));

    }
}
