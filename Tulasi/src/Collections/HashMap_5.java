package Collections;

import java.util.HashMap;

//Write a Java program to check whether a map contains key-value mappings (empty) or not.
public class HashMap_5 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap_obj=new HashMap<>();
        hashMap_obj.put(1,"Steve");
        hashMap_obj.put(2,"Ram");
        hashMap_obj.put(3,"Tim");
        hashMap_obj.put(4,"Win");
        System.out.println("Iterating HashMap: "+hashMap_obj);
        System.out.println("Before clearing the key-value mappings :"+hashMap_obj.isEmpty());
        hashMap_obj.clear();
        System.out.println("After clearing the key-value mappings :"+hashMap_obj.isEmpty());
    }
}
