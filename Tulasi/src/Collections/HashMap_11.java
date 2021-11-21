package Collections;

import java.util.HashMap;
import java.util.Set;

//Write a Java program to get a set view of the keys contained in this map.
public class HashMap_11 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap_obj = new HashMap<>();
        hashMap_obj.put(1, "Steve");
        hashMap_obj.put(2, "Ram");
        hashMap_obj.put(3, "Tim");
        hashMap_obj.put(4, "Win");
        System.out.println("Iterating HashMap: " + hashMap_obj);

        Set setObj=hashMap_obj.keySet();
        System.out.println("To get a set view of the keys contained in this map"+setObj);

    }
}
