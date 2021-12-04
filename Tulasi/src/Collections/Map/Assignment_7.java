package Collections.Map;

import java.util.HashMap;
import java.util.Map;

//7.WAP to replace particular entry in given Hash Map?
public class Assignment_7 {
    public static void main(String[] args) {
        Map<String,Byte> map=new HashMap<>();
        map.put("Red", (byte) 1);
        map.put("Blue", (byte) 2);
        map.put("Green",(byte)3);
        map.put("Yellow",(byte)4);
        map.put("Pink",(byte)5);
        map.put("Orange",(byte)6);

        map.replace("Red",(byte)7);
        System.out.println("Replace particular entry in given Hash Map: "+map);

        map.replace("Blue",(byte)2,(byte)8);
        System.out.println("Replace particular entry in given Hash Map: "+map);
    }
}
