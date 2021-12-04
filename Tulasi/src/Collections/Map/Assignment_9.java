package Collections.Map;

import java.util.HashMap;
import java.util.Map;

//9.WAP to copy one Hash Map to another Hash Map?
public class Assignment_9 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("Subject-1","English");
        map.put("Subject-2","Maths");
        map.put("Subject-3","GK");
        map.put("Subject-4","Computers");

        Map<String,String> mp=new HashMap<>();
        mp.put("Subject-5","Science");
        mp.put("Subject-6","Telugu");
        mp.put("Subject-7","Hindi");
        mp.put("Subject-8","Science");

        map.putAll(mp);
        System.out.println("Copy one Hash Map to another Hash Map: "+map);
    }
}
