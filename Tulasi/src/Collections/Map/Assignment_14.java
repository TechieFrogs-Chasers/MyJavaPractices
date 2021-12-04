package Collections.Map;

import java.util.Map;
import java.util.TreeMap;

//14.Can we add null key/null value to a Tree Map and prove with an example?
//TreeMap doesnot allow null key and but it allows null value
public class Assignment_14 {
    public static void main(String[] args) {
        Map<String,String> map=new TreeMap<>();
        map.put("Subject-1","English");
        map.put("Subject-2","Maths");
        map.put("Subject-3","GK");
        map.put("Subject-4","Computers");
        map.put("Subject-5",null);
        //map.put(null,"PE");
       // map.put(null,null);
        for (Map.Entry<String,String> tm:map.entrySet())
        {
            System.out.println(tm.getKey()+":-"+tm.getValue());
        }

    }
}
