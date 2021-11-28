package Collections;

import java.util.HashMap;

//Write a Java program to test if a map contains a mapping for the specified key.
public class HashMap_7 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap_obj = new HashMap<>();
        hashMap_obj.put(1, "Steve");
        hashMap_obj.put(2, "Ram");
        hashMap_obj.put(3, "Tim");
        hashMap_obj.put(4, "Win");
        System.out.println("Iterating HashMap: " + hashMap_obj);

        System.out.println("1. Is  3 key vaule exists : ");
        if(hashMap_obj.containsKey(3)){
            System.out.println("Yes 3 key value is exists-"+" "+hashMap_obj.get(3));
        }else {
            System.out.println("No 3 key value is not exists!");
        }
        System.out.println("2. Is 5 key value exists :");
        if(hashMap_obj.containsKey(5)){
            System.out.println("Yes 5 key value is exists-"+" "+hashMap_obj.get(5));
        }else {
            System.out.println("No 5 key value is not exists!");
        }

    }
}
