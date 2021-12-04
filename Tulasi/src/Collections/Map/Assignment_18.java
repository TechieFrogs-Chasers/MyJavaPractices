package Collections.Map;

import java.util.*;

//18.Give an example when will get ConcurrentModificationException in Hash Map or Tree Map or Linked Hash Map?
public class Assignment_18 {
    public static void main(String[] args) {
        //TreeMap
        Map<String, String> map = new TreeMap<>();
        map.put("Subject-1", "English");
        map.put("Subject-2", "Maths");
        map.put("Subject-3", "GK");
        map.put("Subject-4", "Computers");
        Iterator<Map.Entry<String, String>> i = map.entrySet().iterator();
        while (i.hasNext()) {
            Map.Entry<String, String> entry = i.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
            map.put("Subject-5", "PE");
        }

        //HashMap
        HashMap<String, Byte> hmap = new HashMap<>();
        hmap.put("Red", (byte) 1);
        hmap.put("Blue", (byte) 2);
        hmap.put("Green", (byte) 3);
        hmap.put("Yellow", (byte) 4);
        hmap.put("Pink", (byte) 5);
        hmap.put("Orange", (byte) 6);
        Iterator<Map.Entry<String, Byte>> it = hmap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Byte> entry = it.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
            hmap.put("White", (byte)8);

        }
        //LinkedHashMap

        LinkedHashMap<String, Integer> lmap = new LinkedHashMap<>();
        lmap.put("Red", 100);
        lmap.put("Blue", 200);
        lmap.put("Green", 300);
        lmap.put("Yellow", 400);
        lmap.put("Pink", 500);
        lmap.put("Orange", 600);
        Iterator<Map.Entry<String, Integer>> ith = lmap.entrySet().iterator();
        while (ith.hasNext()) {
            Map.Entry<String, Integer> entry = ith.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
            lmap.put("White", 800);

            //HashTable
            Hashtable<String, Byte> ht = new Hashtable<>();
            ht.put("Red", (byte) 1);
            ht.put("Blue", (byte) 2);
            ht.put("Green", (byte) 3);
            ht.put("Yellow", (byte) 4);
            ht.put("Pink", (byte) 5);
            ht.put("Orange", (byte) 6);
            Iterator<Map.Entry<String, Byte>> htt = ht.entrySet().iterator();
            while (htt.hasNext()) {
                Map.Entry<String, Byte> entry1 = htt.next();
                System.out.println("Key = " + entry1.getKey() + ", Value = " + entry.getValue());
                ht.put("White", (byte)8);
            }

        }
    }
}