package Collections;

import java.util.HashMap;

// Write a Java program to remove all of the mappings from a map.
public class HashMap_4 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap_obj=new HashMap<>();
        hashMap_obj.put(1,"Steve");
        hashMap_obj.put(2,"Ram");
        hashMap_obj.put(3,"Tim");
        hashMap_obj.put(4,"Win");
        System.out.println("Iterating HashMap: "+hashMap_obj);

        hashMap_obj.clear();
        System.out.println("New hashmap : "+hashMap_obj);
    }
}
