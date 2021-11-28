package Collections;

import java.util.HashMap;
import java.util.Set;

//Write a Java program to create a set view of the mappings contained in a map.
public class HashMap_9 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap_obj = new HashMap<>();
        hashMap_obj.put(1, "Steve");
        hashMap_obj.put(2, "Ram");
        hashMap_obj.put(3, "Tim");
        hashMap_obj.put(4, "Win");
        System.out.println("Iterating HashMap: " + hashMap_obj);

        Set setobj=hashMap_obj.entrySet();
        System.out.println("To create set view of the mapping :"+setobj);


    }
}
