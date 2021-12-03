package Collections.Map;

import java.util.HashMap;
import java.util.Map;

//WAP to check particular Key exist or not in Hash Map?
public class Assignment_5 {
    public static void main(String[] args) {
        Map<String,Byte> map=new HashMap<>();
        map.put("Red", (byte) 1);
        map.put("Blue", (byte) 2);
        map.put("Green",(byte)3);
        map.put("Yellow",(byte)4);
        map.put("Pink",(byte)5);
        map.put("Orange",(byte)6);

        System.out.println(map.size());
        boolean result=map.containsKey("Green");
        if(result)
            System.out.println("Key exist!");
        else
            System.out.println("Key doesnot exist!");
    }
}
