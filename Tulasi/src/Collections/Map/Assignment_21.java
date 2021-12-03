package Collections.Map;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


//How to implement generics for Map implemented classes with an example?
public class Assignment_21 {
    public static void main(String[] args) {
        Map<Integer,Integer> s = new HashMap();
        //add element to generic
        Integer i = 77;
        Integer j=55;
        s.put(i,j);
        System.out.println(i+" ," +j);
        //Iterator
        Iterator<Map.Entry<Integer,Integer>> it = s.entrySet().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //for loop
        for (Map.Entry<Integer,Integer> l : s.entrySet()) {
            System.out.println(l.getKey()+", "+l.getValue());
        }
    }
}
