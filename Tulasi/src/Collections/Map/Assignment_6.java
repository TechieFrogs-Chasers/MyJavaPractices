package Collections.Map;

import java.util.HashMap;
import java.util.Map;

//WAP to check particular Value exist or not in Hash Map?
public class Assignment_6 {
    public static void main(String[] args) {
        Map<String,Byte> map=new HashMap<>();
        map.put("Red", (byte) 1);
        map.put("Blue", (byte) 2);
        map.put("Green",(byte)3);
        map.put("Yellow",(byte)4);
        map.put("Pink",(byte)5);
        map.put("Orange",(byte)6);

        System.out.println(map.size());
        boolean result=map.containsValue((byte)7);
        if(result)
            System.out.println("Value exist!");
        else
            System.out.println("Value doesnot exist!");
    }
}
