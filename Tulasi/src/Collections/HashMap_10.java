package Collections;

import java.util.HashMap;
import java.util.Set;

//Write a Java program to get the value of a specified key in a map
public class HashMap_10 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap_obj = new HashMap<>();
        hashMap_obj.put(1, "Steve");
        hashMap_obj.put(2, "Ram");
        hashMap_obj.put(3, "Tim");
        hashMap_obj.put(4, "Win");
        System.out.println("Iterating HashMap: " + hashMap_obj);
        String value = hashMap_obj.get(2);
        System.out.println("Value of key 2: "+value);
    }
}
