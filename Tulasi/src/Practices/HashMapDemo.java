package Practices;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map1=new HashMap<>();
        map1.put(111,"India");//put()  method to add objects in the form of key and values
        map1.put(222,"USA");
        Map<Integer,String>map2=new HashMap<>();
        map2.put(333,"UK");
        map2.put(444,"NZL");
        map1.putAll(map2);//adding two HashMaps
        System.out.println(map1);
        System.out.println(map1.size());

        map2.putIfAbsent(555,"Canada");//putIfAbsent() method -adding specified key with specified value.
        System.out.println(map2);

        map2.replace(333,"UK","AUS");//replace(key,old value,new value) method
        System.out.println(map2);

        map2.replace(555,"Canada","Mexico");
        System.out.println(map2);

        map1.remove(222,"USA");//remove(key,value)
        System.out.println(map1);

        boolean flag= map1.containsKey(111);//check whether particular key or not
        if(flag)
            System.out.println("Key exists");
        else
            System.out.println("Key doesnot exis");

        boolean flag1= map1.containsValue("USA");//check whether particular key or not
        if(flag1)
            System.out.println("Value exists");
        else
            System.out.println("Value doesnot exist");
    }
}
