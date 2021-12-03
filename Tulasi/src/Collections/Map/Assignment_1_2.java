package Collections.Map;

import java.util.HashMap;
import java.util.Map;

//Explain How to create Hash Map object with an example?
//WAP to add elements to Hash Map Dynamically?
public class Assignment_1_2 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("Ram",15);
        map.put("Ravi",55);
        map.put("Jim",44);
        map.put("Leo",47);
        System.out.println(map);

    }
}
