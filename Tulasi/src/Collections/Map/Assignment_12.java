package Collections.Map;

import java.util.Map;
import java.util.TreeMap;

//How do you append an element at the end of Tree Map?
public class Assignment_12 {
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
        //map.put();
    }
}
