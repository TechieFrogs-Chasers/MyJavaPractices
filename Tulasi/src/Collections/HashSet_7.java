package Collections;
//Write a Java program to convert a hash set to an array.
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashSet_7 {
    public static void main(String[] args) {
        HashSet<String> h_set = new HashSet<>();
        h_set.add("Red");
        h_set.add("Blue");
        h_set.add("White");
        h_set.add("Green");
        h_set.add("Pink");
        h_set.add("Yellow");
        System.out.println("Original hashset elements- \n" + h_set);

        String[] setArray=new String[h_set.size()];//Array
        h_set.toArray(setArray);

        for(String array: setArray){
            System.out.println(array);
        }
    }
}
