package Collections.Map;

import java.util.*;

//28.WAP to retrieve only values from given HashMap?
public class Assignment_28 {
    public static void main(String[] args) {
            Map<String,String> map=new HashMap<>();
            map.put("Subject-1","English");
            map.put("Subject-2","Maths");
            map.put("Subject-3","GK");
            map.put("Subject-4","Computers");
            map.put("Subject-5",null);
            map.put(null,null);

            Collection<String> collection=  map.values();
            Iterator<String> it=collection.iterator();
            System.out.println("Retrieve only values from given HashMap: " );
            while (it.hasNext()) {
                System.out.println(it.next());
            }
    }
}
