package Collections.Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//12.How do you append an element at the end of Tree Map?
public class Assignment_12 {
    public static void main(String[] args) {
        Map<String,String> map=new TreeMap<>();
        map.put("Subject-1","English");
        map.put("Subject-2","Maths");
        map.put("Subject-3","GK");
        map.put("Subject-4","Computers");
        System.out.println("Before append an element at the end of Tree Map:"+map);

        LinkedHashMap<String,String> append=new LinkedHashMap<>(map);
        append.put("Subject-5","PE");
        map= new TreeMap<>(append);
        System.out.println("Append an element at the end of Tree Map: "+map);
    }
}
