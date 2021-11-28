package Collections;

import java.util.TreeMap;
// Write a Java program to search a value in a Tree Map.
public class TreeMap_4 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap_obj = new TreeMap<>();

        treeMap_obj.put(11, "Green");
        treeMap_obj.put(22, "Blue");
        treeMap_obj.put(33, "Red");
        treeMap_obj.put(44, "White");
        treeMap_obj.put(55, "Black");
        System.out.println("Treemap values -" + treeMap_obj);

        if(treeMap_obj.containsValue("Red")){
            System.out.println("Value exists!");
        }else {
            System.out.println("Value doesnot exist!");
        }
        if(treeMap_obj.containsValue("Pink")){
            System.out.println("Value exists!");
        }else {
            System.out.println("Value doesnot exist!");
        }
    }
}
