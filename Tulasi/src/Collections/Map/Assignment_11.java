package Collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//How do you find the number of elements present in Tree Map?
public class Assignment_11 {
    public static void main(String[] args) {
        Map<String,String> map=new TreeMap<>();
        map.put("Subject-1","English");
        map.put("Subject-2","Maths");
        map.put("Subject-3","GK");
        map.put("Subject-4","Computers");

        for (Map.Entry<String,String> tm:map.entrySet())
        {
            System.out.println(tm.getKey()+":-"+tm.getValue());
        }
        System.out.println("Number of elements present in Tree Map: "+map.size());
    }
}
