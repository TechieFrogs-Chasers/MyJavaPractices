package Collections.Map;

import java.util.Map;
import java.util.TreeMap;

//Can we add heterogeneous elements to a Tree Map and prove with an example?
public class Assignment_16 {
    public static void main(String[] args) {
        Map<String,String> map=new TreeMap<>();
        map.put("Subject-1","English");
        map.put("Subject-2","Maths");
        map.put("Subject-3","GK");
        map.put("Subject-4","Computers");
        map.put("Subject-5",null);
        for (Map.Entry<String,String> tm:map.entrySet())
        {
            System.out.println(tm.getKey()+":-"+tm.getValue());
        }

        //map.put(12,"String");

    }
}
