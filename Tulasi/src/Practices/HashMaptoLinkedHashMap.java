package Practices;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMaptoLinkedHashMap {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("Ram",15);
        map.put("Ravi",55);
        map.put("Jim",44);
        map.put("Leo",47);
        System.out.println(map);
        LinkedHashMap<String ,Integer> convertHashtoLinked=new LinkedHashMap<>(map);
        System.out.println(convertHashtoLinked);
    }
}
