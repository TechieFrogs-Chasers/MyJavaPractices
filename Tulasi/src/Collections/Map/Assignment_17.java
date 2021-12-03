package Collections.Map;

import java.util.*;

//How to make a Hash Map or Linked Hash Map or Tree Map as thread safe?
public class Assignment_17 {
    public static void main(String[] args) {
        //TreeMap
        Map<String,String> map=new TreeMap<>();
        map.put("Subject-1","English");
        map.put("Subject-2","Maths");
        map.put("Subject-3","GK");
        map.put("Subject-4","Computers");
        Collections.synchronizedMap (map);
        System.out.println("Tree Map as thread safe: "+map);


        //HashMap
        Map<String,Byte> hmap=new HashMap<>();
        hmap.put("Red", (byte) 1);
        hmap.put("Blue", (byte) 2);
        hmap.put("Green",(byte)3);
        hmap.put("Yellow",(byte)4);
        hmap.put("Pink",(byte)5);
        hmap.put("Orange",(byte)6);
        Collections.synchronizedMap (hmap);
        System.out.println("Hash Map as thread safe: "+hmap);

       //LinkedHashMap

        Map<String,Integer> lmap=new LinkedHashMap<>();
        lmap.put("Red", 100);
        lmap.put("Blue", 200);
        lmap.put("Green",300);
        lmap.put("Yellow",400);
        lmap.put("Pink",500);
        lmap.put("Orange",600);
        Collections.synchronizedMap (lmap);
        System.out.println("Linked Hash Map as thread safe: "+lmap);


        //Hashtable
        Map<String,Byte> htt=new Hashtable<>();
        htt.put("Red", (byte) 1);
        htt.put("Blue", (byte) 2);
        htt.put("Green",(byte)3);
        htt.put("Yellow",(byte)4);
        htt.put("Pink",(byte)5);
        htt.put("Orange",(byte)6);
        Collections.synchronizedMap (htt);
        System.out.println("Hash Table as thread safe: "+htt);


    }
}
