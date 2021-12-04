package Collections.Map;

import java.util.*;

//25.Can we add multiple null’s in Map implemented classes? If yes prove with an example?
//HashMap,LinkedHashMap-1 null key& multiple null values, TreeMap-0 null key& allow null value,Hashtable- doesnot allow null keys or values.
public class Assignment_25 {
    public static void main(String[] args) {
        //TreeMap
        Map<String,String> map=new TreeMap<>();
        map.put("Subject-1","English");
        map.put("Subject-2","Maths");
        map.put("Subject-3","GK");
        map.put("Subject-4","Computers");
        map.put(null,null);
        map.put(null,null);

        System.out.println("Added multiple null’s in Map implemented classes: "+map);


        //HashMap
        Map<String,Byte> hmap=new HashMap<>();
        hmap.put("Red", (byte) 1);
        hmap.put("Blue", (byte) 2);
        hmap.put("Green",(byte)3);
        hmap.put("Yellow",(byte)4);
        hmap.put("Pink",(byte)5);
        hmap.put("Orange",(byte)6);
        hmap.put(null,null);
        hmap.put(null,null);
        System.out.println("Added multiple null’s in Map implemented classes: "+hmap);

        //LinkedHashMap

        Map<String,Integer> lmap=new LinkedHashMap<>();
        lmap.put("Red", 100);
        lmap.put("Blue", 200);
        lmap.put("Green",300);
        lmap.put("Yellow",400);
        lmap.put("Pink",500);
        lmap.put("Orange",600);
        lmap.put(null,null);
        lmap.put(null,null);
        System.out.println("Added multiple null’s in Map implemented classes: "+lmap);


        //HashTable
        Map<String,Byte> htt=new Hashtable<>();
        htt.put("Red", (byte) 1);
        htt.put("Blue", (byte) 2);
        htt.put("Green",(byte)3);
        htt.put("Yellow",(byte)4);
        htt.put("Pink",(byte)5);
        htt.put("Orange",(byte)6);
        htt.put(null,null);
        htt.put(null,null);
        System.out.println("Added multiple null’s in Map implemented classes: "+htt);

    }
}
