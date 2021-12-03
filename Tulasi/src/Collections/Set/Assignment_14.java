package Collections.Set;

import java.util.HashSet;

//Display common elements in 2 HashSets?
public class Assignment_14 {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<String>();
        hs.add("B");
        hs.add("L");
        hs.add("U");
        hs.add("E");
        hs.add("G");
        System.out.println("Original set1: "+ hs);
        HashSet<String> hs1=new HashSet<String>();
        hs1.add("G");
        hs1.add("R");
        hs1.add("U");
        hs1.add("E");
        hs1.add("N");
        System.out.println("Original set2:  "+ hs1);

        hs.retainAll(hs1);
        System.out.println("Common elements in 2 HashSets: "+hs);

    }
}
