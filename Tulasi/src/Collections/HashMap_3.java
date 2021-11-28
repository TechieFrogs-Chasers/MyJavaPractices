package Collections;

import java.util.HashMap;

// Write a Java program to copy all of the mappings from the specified map to another map.
public class HashMap_3 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap_obj1=new HashMap<>();

        hashMap_obj1.put(1,"Steve");
        hashMap_obj1.put(2,"Ram");
        hashMap_obj1.put(3,"Tim");
        hashMap_obj1.put(4,"Win");
        System.out.println("Iterating HashMap1: "+hashMap_obj1);

        HashMap<Integer,String> hashMap_obj2=new HashMap<>();

        hashMap_obj2.put(5,"Ravi");
        hashMap_obj2.put(6,"Sree");
        hashMap_obj2.put(7,"Siva");
        hashMap_obj2.put(8,"Pinky");
        System.out.println("Iterating HashMap2: "+hashMap_obj2);

        hashMap_obj1.putAll(hashMap_obj2);
        System.out.println("Iterating HashMap: "+hashMap_obj1);



    }
}
