package Collections.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//19.How to avoid ConcurrentModificationException in HashMap with an example?
public class Assignment_19 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Subject-1", "English");
        map.put("Subject-2", "Maths");
        map.put("Subject-3", "GK");
        map.put("Subject-4", "Computers");

        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
            map.put("Subject-5", "PE");
        }
    }
}
