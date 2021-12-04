package Collections.Map;

import java.util.*;

//20.What is UnsupportedOperationException and when will get in Map implemented classes?
public class Assignment_20 {
    public static void main(String[] args) {
        Map<String,String> hashmap = new HashMap<>();

        hashmap.put("Java","Hard");
        hashmap.put("Hard","Java");

        // getting unmodifiable HashSet
        Map<String,String> unmodifiablemap = Collections.unmodifiableMap(hashmap);
        // Now any attempt to modify list will throw java.lang.UnsupportedOperationException
        unmodifiablemap.put("Language","Java");
    }
}
