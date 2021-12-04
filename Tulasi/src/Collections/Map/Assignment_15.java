package Collections.Map;

import java.util.HashMap;
import java.util.Map;

//15.Can we add null key/null value to a Hash Map and prove with an example?
//HashMap will allows one null key and multiple null values.
public class Assignment_15 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("Subject-1","English");
        map.put("Subject-2","Maths");
        map.put("Subject-3","GK");
        map.put("Subject-4","Computers");
        map.put("Subject-5",null);
        map.put(null,null);
        map.put(null,null);
        System.out.println("Hash Map entries: "+map.entrySet());
    }
}
