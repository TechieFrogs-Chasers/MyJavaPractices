package Collections.Map;

import java.util.HashMap;
import java.util.Map;
//8.WAP to compare 2 HashMap?
public class Assignment_8 {
    public static void main(String[] args) {
        Map<String,Byte> map=new HashMap<>();
        map.put("Red", (byte) 1);
        map.put("Blue", (byte) 2);
        map.put("Green",(byte)3);

        Map<String,Byte> mp=new HashMap<>();
        mp.put("Yellow",(byte)4);
        mp.put("Pink",(byte)5);
        mp.put("Orange",(byte)6);
        //Compare Hashset
         if(map==mp)
             System.out.println("Two HashMaps are same!");
         else
             System.out.println("Two HashMaps are not same!");

        //System.out.println("map Hashmap == mp HashMap: "+map.equals(mp));

          //Compare keys
        System.out.println("map keys == mp keys: "+map.keySet().equals(mp.keySet()));

        //Compare values
        System.out.println("map Values == mp Values: "+map.values().equals(mp.values()));
    }
}
