package Collections.Map;

import java.util.HashMap;
import java.util.Map;

//How do you remove a key-value pair from a HashMap if and only if the specified key is currently mapped to given value?
public class Assignment_31 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("Subject-1","English");
        map.put("Subject-2","Maths");
        map.put("Subject-3","GK");
        map.put("Subject-4","Computers");
        map.put("Subject-5",null);
        map.put(null,null);

        map.remove(null,null);
        map.remove("Subject-5",null);
        System.out.println("Remove a key-value pair from a HashMap if and only if the specified key is currently mapped to given value: "+map);
    }
}
