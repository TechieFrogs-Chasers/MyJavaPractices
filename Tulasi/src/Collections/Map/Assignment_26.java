package Collections.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


//26.How to make Map implemented classes as read-only with an example?
public class Assignment_26 {
    public static void main(String[] args) {
        Map<String,Integer> hm=new HashMap<>();
        hm.put("Leo",55);
        hm.put("Ravi",44);
        hm.put("Jim",66);

        Map<String,Integer> immutable= Collections.unmodifiableMap(hm);
        //immutable.put("Ram",22);
        System.out.println(immutable);
    }
}
