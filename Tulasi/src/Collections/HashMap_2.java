package Collections;
//Write a Java program to count the number of key-value (size) mappings in a map.
import java.util.*;

public class HashMap_2 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap_Obj=new HashMap<>();
        hashMap_Obj.put(1,"Steve");
        hashMap_Obj.put(2,"Ram");
        hashMap_Obj.put(3,"Tim");
        hashMap_Obj.put(4,"Win");

        System.out.println("key-value (size) mappings in a map : "+ hashMap_Obj.size());
    }
}
