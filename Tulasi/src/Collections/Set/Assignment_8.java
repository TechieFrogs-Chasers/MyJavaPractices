import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

//Replace particular element in given HashSet?
public class Assignment_8 {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        System.out.println(set);
        if (set.contains("B")) {
            set.remove("B");
            set.add("E");
        }
        System.out.println("After replacing B with E");
        System.out.println(set);
    }
}
