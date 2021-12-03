package Collections.Map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

//Can we add heterogeneous elements to a Tree Map and prove with an example?
// map.put("Subject-5", 12);
//Exception in thread "main" java.lang.Error: Unresolved compilation problems:
//The method put(String, String) in the type Map<String,String> is not applicable for the arguments (String, int)
public class Assignment_16 {
    public static void main(String[] args) {
        Map<String,String> map = new TreeMap<>();
        map.put("Subject-1", "English");
        map.put("Subject-2", "Maths");
        map.put("Subject-3", "GK");
        map.put("Subject-4", "Computers");
        map.put("Subject-5", null);
        Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, String> entry = iter.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }


    }
}
