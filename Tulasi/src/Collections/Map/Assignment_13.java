package Collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//How do you remove all elements of Tree Map or Hash Map at a time?
public class Assignment_13 {
    public static void main(String[] args) {
        //TreeMap
        Map<String,String> map=new TreeMap<>();
        map.put("Subject-1","English");
        map.put("Subject-2","Maths");
        map.put("Subject-3","GK");
        map.put("Subject-4","Computers");
        for (Map.Entry<String,String> tm:map.entrySet())
        {
            System.out.println(tm.getKey()+":-"+tm.getValue());
        }

        map.clear();
        System.out.println("Remove all elements of Tree Map :"+map);

        //HashMap
        Map<String,Byte> hmap=new HashMap<>();
        hmap.put("Red", (byte) 1);
        hmap.put("Blue", (byte) 2);
        hmap.put("Green",(byte)3);
        hmap.put("Yellow",(byte)4);
        hmap.put("Pink",(byte)5);
        hmap.put("Orange",(byte)6);
        System.out.println("HashMap :"+hmap);
        hmap.clear();
        System.out.println("Remove all elements of Hash Map :"+hmap);


    }
}
