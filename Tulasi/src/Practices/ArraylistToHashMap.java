package Practices;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArraylistToHashMap {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("Red");
        al.add("Green");
        al.add("Blue");
        al.add("Black");
        System.out.println("Orignial elements: "+al);
        for(String temp:al){
            System.out.println(temp);
        }
        HashMap<String, Integer> languageMap = convertArrayListToHashMap(al);
        for (Map.Entry<String, Integer> entry : languageMap.entrySet()) {

            System.out.println(entry.getKey() + " : "
                    + entry.getValue());
        }
    }
        private static HashMap<String, Integer>  convertArrayListToHashMap(ArrayList<String> arrayList)
        {

            HashMap<String, Integer> hashMap = new HashMap<>();

            for (String str : arrayList) {

                hashMap.put(str, str.length());
            }

            return hashMap;
    }
}
