package Collections;

import java.util.HashMap;

// Write a Java program to get a collection view of the values contained in this map.
public class HashMap_12 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap_obj = new HashMap<>();
        hashMap_obj.put(1, "Steve");
        hashMap_obj.put(2, "Ram");
        hashMap_obj.put(3, "Tim");
        hashMap_obj.put(4, "Win");
        System.out.println("Iterating HashMap: " + hashMap_obj);

        System.out.println("To get a collection view of the values contained in this map: " + hashMap_obj.values());
    }
}
