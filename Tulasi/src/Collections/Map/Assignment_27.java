package Collections.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//27.WAP to retrieve only keys from given HashMap?
public class Assignment_27 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("Subject-1","English");
        map.put("Subject-2","Maths");
        map.put("Subject-3","GK");
        map.put("Subject-4","Computers");
        map.put("Subject-5",null);
        map.put(null,null);

        Set<String> key=map.keySet();
        Iterator<String> it=key.iterator();
        System.out.println("Retrieve only keys from given HashMap: " );
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
