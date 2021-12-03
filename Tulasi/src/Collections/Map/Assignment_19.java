package Collections.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//How to avoid ConcurrentModificationException in HashMap with an example?
public class Assignment_19 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Subject-1", "English");
        map.put("Subject-2", "Maths");
        map.put("Subject-3", "GK");
        map.put("Subject-4", "Computers");

        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            System.out.println("The Map Value is: " + map.get(key));
            if (key.equals(2)) {
                map.put("Subject-5","PE");
                System.out.println(map);
            }
        }
    }
}