package Collections;


import java.util.HashSet;

//Write a Java program to append the specified element to the end of a hash set.
public class HashSet_1 {
    public static void main(String[] args) {//Hashset dont allow random access
        HashSet<String> h_set = new HashSet<>();
        h_set.add("Red");
        h_set.add("Blue");
        h_set.add("White");
        h_set.add("Green");
        h_set.add("Pink");
        h_set.add("Yellow");
        System.out.println("Original hashset elements- \n"+h_set);
    }
}
