package Collections.Map;

import java.util.HashMap;
import java.util.Map;

//10.WAP to get particular entry from given Hash Map?
public class Assignment_10 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("Subject-1","English");
        map.put("Subject-2","Maths");
        map.put("Subject-3","GK");
        map.put("Subject-4","Computers");
          //to get both key and value
        System.out.println("Hash Map entries: "+map.entrySet());

        //get particular entry from given Hash Map
        String entry="Subject-2";
        for (Map.Entry<String,String> e:map.entrySet()){
            if(e.getKey()==entry)
                System.out.println("The key for value " + entry + " is: " + e.getValue());
        }
        String entrys="GK";
        for (Map.Entry<String,String> et:map.entrySet()){
            if(et.getValue()==entrys)
                System.out.println("The value for key " + entrys + " is: " + et.getKey());
        }
    }
}
