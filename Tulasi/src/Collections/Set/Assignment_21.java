package Collections.Set;


import java.util.HashSet;
import java.util.TreeSet;

//Can we add null element in HashSet?
public class Assignment_21 {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(11);
        hs.add(22);
        hs.add(33);
        hs.add(44);
        hs.add(55);
        hs.add(null);//HashSet allow null keys.
        hs.add(null);//only one null will be printed ,it will override previous null key.
        System.out.println("Original set: "+ hs);
    }
}