package Collections.Set;

import java.util.*;

//Convert array to HashSet?
public class Assignment_11 {
    public static void main(String[] args) {
        Integer[] array = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        Set<Integer> convertarray = new HashSet<>(Arrays.asList(array));

        System.out.println("Set: " + convertarray);
    }
}