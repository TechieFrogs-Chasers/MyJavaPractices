package Collections;

import java.util.*;
//import java.util.HashMap;
//import java.util.Map;

// Write a Java program to associate the specified value with the specified key in a HashMap.
public class HashMap_1 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashmap_Obj = new HashMap<Integer, String>();
        hashmap_Obj.put(111, "Steve");
        hashmap_Obj.put(222, "Kim");
        hashmap_Obj.put(333, "Tim");

        System.out.println("Iterating HashMap: ");

        for (Map.Entry map : hashmap_Obj.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }
    }
}
