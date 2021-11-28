package Collections;

import java.util.HashMap;

// Write a Java program to get a shallow copy of a HashMap instance.
public class HashMap_6 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap_obj = new HashMap<>();
        hashMap_obj.put(1, "Steve");
        hashMap_obj.put(2, "Ram");
        hashMap_obj.put(3, "Tim");
        hashMap_obj.put(4, "Win");
        System.out.println("Iterating HashMap: " + hashMap_obj);
        hashMap_obj.clone();//shallow copy means cloning
        System.out.println("After cloning: " + hashMap_obj);
    }

}
