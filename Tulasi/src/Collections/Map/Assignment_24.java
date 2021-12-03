package Collections.Map;
//Can we use list-iterator to iterate data in Map implemented classes?
//-No,It is only applicable for List collection implemented classes like ArrayList, LinkedList, etc. It provides bi-directional iteration. ListIterator must be used when we want to enumerate elements of List. This cursor has more functionality(methods) than iterator. ListIterator object can be created by calling listIterator() method present in the List interface.

import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;

public class Assignment_24 {
    public static void main(String[] args) {
HashMap<String,Integer> map = new HashMap<>();
        map.put("key1", 1);
        map.put("key2", 2);
        map.put("key3", 3);
        map.put("key4", 4);
        System.out.println(map);
      /*  ListIterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
        while(it.hasNext())
        {
            Map.Entry<String, Integer> entry = it.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
            map.put("key5", 5);
        }*/


    }
}
