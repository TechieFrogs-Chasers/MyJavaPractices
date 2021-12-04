package Collections.Map;

import java.util.HashMap;
import java.util.Map;

//3.WAP to check HashMap is empty or not with an example?
public class Assignment_3 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("Ram",15);
        map.put("Ravi",55);
        map.put("Jim",44);
        map.put("Leo",47);
        System.out.println(map);
        boolean result=map.isEmpty();
        System.out.println(result);
          map.clear();
        System.out.println(map.isEmpty());
    }
}
