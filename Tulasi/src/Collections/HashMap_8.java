package Collections;

import java.util.HashMap;

//Write a Java program to test if a map contains a mapping for the specified value.
public class HashMap_8 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap_obj = new HashMap<>();
        hashMap_obj.put(1, "Steve");
        hashMap_obj.put(2, "Ram");
        hashMap_obj.put(3, "Tim");
        hashMap_obj.put(4, "Win");
        System.out.println("Iterating HashMap: " + hashMap_obj);

        System.out.println("1. Is  Ram key vaule exists : ");
        if(hashMap_obj.containsValue("Ram")){
            System.out.println("Yes Ram key value is exists-"+" "+hashMap_obj.get("Ram"));
        }else {
            System.out.println("No Ram key value is not exists!");
        }
        System.out.println("2. Is Jim key value exists :");
        if(hashMap_obj.containsValue("Jim")){
            System.out.println("Yes Jim key value is exists-"+" "+hashMap_obj.get("Jim"));
        }else {
            System.out.println("No Jim key value is not exists!");
        }
    }
}
