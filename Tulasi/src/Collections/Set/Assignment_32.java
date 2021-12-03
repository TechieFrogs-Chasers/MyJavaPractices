package Collections.Set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

//How to make set implemented classes as read-only with an example?
public class Assignment_32 {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        hs.add("Leo");
        hs.add("Ravi");
        hs.add("Jim");
        System.out.println(hs);
        Set<String> immutable=Collections.unmodifiableSet(hs);
       // immutable.add("Ram");
        System.out.println(immutable);

    }
}
