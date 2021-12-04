package Collections.Map;

import java.util.HashMap;
import java.util.Map;

//30.How do you replace a value associated with the given key if and only if it is currently mapped to given value?
public class Assignment_30 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("Subject-1","English");
        map.put("Subject-2","Maths");
        map.put("Subject-3","GK");
        map.put("Subject-4","Computers");

        System.out.println(map.toString());
        map.replace("Subject-2","PE");
        System.out.println("Replace a value associated with the given key if and only if it is currently mapped to given value: "+map.toString());
    }
}
