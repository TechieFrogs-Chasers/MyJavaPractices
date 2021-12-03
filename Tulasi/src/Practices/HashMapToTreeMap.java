package Practices;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapToTreeMap {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("Ram",15);
        map.put("Ravi",55);
        map.put("Jim",44);
        map.put("Leo",47);
        System.out.println(map);
        TreeMap<String,Integer> convertHashToTree=new TreeMap<>(map);
        System.out.println(convertHashToTree);
    }
}
