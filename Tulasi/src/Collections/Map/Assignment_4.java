package Collections.Map;

import java.util.HashMap;
import java.util.Map;

//WAP to remove particular entry from Hash Map with an example?
public class Assignment_4 {
    public static void main(String[] args) {
        Map<String,Byte> map=new HashMap<>();
        map.put("Red", (byte) 1);
        map.put("Blue", (byte) 2);
        map.put("Green",(byte)3);
        map.put("Yellow",(byte)4);
        map.put("Pink",(byte)5);
        map.put("Orange",(byte)6);

        map.remove("Orange");
        map.remove("Pink",(byte)5);
        System.out.println("Remove particular entry from Hash Map: "+map);


    }
}
