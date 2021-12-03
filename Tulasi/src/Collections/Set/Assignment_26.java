package Collections.Set;

import java.util.*;

//What is UnsupportedOperationException and when will get in set implemented classes?
public class Assignment_26 {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<String>();

        hashSet.add("Java");
        hashSet.add("Hard");

        // getting unmodifiable HashSet
        Set<String> unmodifiableSet = Collections.unmodifiableSet(hashSet);

       // Now any attempt to modify list will throw java.lang.UnsupportedOperationException

        unmodifiableSet.add("Language");

    }
}
