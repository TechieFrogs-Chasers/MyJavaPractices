package Collections.Map;

import java.util.*;

//22.List down methods to make collection thread-safe with an examples?
public class Assignment_22 {
    public static void main(String[] args) {
        //Collection -List thread safe
        //ArrayList
        List<Integer> l=new ArrayList<>();
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        Collections.synchronizedList(l);
        l.add(6);
        System.out.println(l);
        //Vector
        List<Integer> v=new Vector<>();
        v.add(4);
        v.add(5);
        v.add(6);
        Collections.synchronizedList(v);
        v.add(7);
        System.out.println(v);
        //LinkedList
        List<Integer> ll=new LinkedList<>();
        ll.add(7);
        ll.add(8);
        ll.add(9);
        Collections.synchronizedList(ll);
        ll.add(10);
        System.out.println(ll);

        //Collections-Set thread safe
        //HashSet
        Set<Integer> sh=new HashSet<>();
        sh.add(11);
        sh.add(12);
        sh.add(13);
        Collections.synchronizedSet(sh);
        sh.add(14);
        System.out.println(sh);
        //LinkedHashSet
        Set<Integer> lhs=new LinkedHashSet<>();
        lhs.add(15);
        lhs.add(16);
        lhs.add(17);
        Collections.synchronizedSet(lhs);
        lhs.add(18);
        System.out.println(lhs);
        //Treeset
        Set<Integer> ts=new TreeSet<>();
        ts.add(19);
        ts.add(20);
        ts.add(21);
        Collections.synchronizedSet(ts);
        ts.add(22);
        System.out.println(ts);

        //Collections-Map thread safe
        //TreeMap
        Map<String,String> map=new TreeMap<>();
        map.put("Subject-1","English");
        map.put("Subject-2","Maths");
        map.put("Subject-3","GK");
        map.put("Subject-4","Computers");
        Collections.synchronizedMap (map);
        System.out.println("Tree Map as thread safe: "+map);


        //HashMap
        Map<String,Byte> hmap=new HashMap<>();
        hmap.put("Red", (byte) 1);
        hmap.put("Blue", (byte) 2);
        hmap.put("Green",(byte)3);
        hmap.put("Yellow",(byte)4);
        hmap.put("Pink",(byte)5);
        hmap.put("Orange",(byte)6);
        Collections.synchronizedMap (hmap);
        System.out.println("Hash Map as thread safe: "+hmap);

        //LinkedHashMap
        Map<String,Integer> lmap=new LinkedHashMap<>();
        lmap.put("Red", 100);
        lmap.put("Blue", 200);
        lmap.put("Green",300);
        lmap.put("Yellow",400);
        lmap.put("Pink",500);
        lmap.put("Orange",600);
        Collections.synchronizedMap (lmap);
        System.out.println("Linked Hash Map as thread safe: "+lmap);

        //HashTable
        Map<String,String> ht=new Hashtable<>();
        ht.put("Subject-1","English");
        ht.put("Subject-2","Maths");
        ht.put("Subject-3","GK");
        ht.put("Subject-4","Computers");
        Collections.synchronizedMap (ht);
        System.out.println("HashTable as thread safe: "+ht);


    }
}
