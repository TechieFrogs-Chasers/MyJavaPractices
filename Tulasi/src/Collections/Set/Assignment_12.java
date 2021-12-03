package Collections.Set;

import java.util.Arrays;
import java.util.HashSet;

//Convert HashSet to Array?
public class Assignment_12 {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<String>();
        hs.add("B");
        hs.add("L");
        hs.add("U");
        hs.add("E");
        hs.add("S");
        System.out.println("Original HashSet :"+hs);
        String[] array=new String[hs.size()];
        hs.toArray(array);
        System.out.println("Covert HashSet to Array: "+Arrays.toString(array));

    }
}
