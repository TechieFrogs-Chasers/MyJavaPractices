package Collections;
//Write a Java program to convert a hash set to a List/ArrayList.
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class HashSet_9 {
    public static void main(String[] args) {
        HashSet<String> h_set = new HashSet<>();
        h_set.add("Red");
        h_set.add("Blue");
        h_set.add("White");
        h_set.add("Green");
        h_set.add("Pink");
        h_set.add("Yellow");
        System.out.println("Original hashset elements- \n" + h_set);
        System.out.println();

        List<String> list_set=new LinkedList<>(h_set);//convert hashset to linkedlist
        for (String listset:list_set){
            System.out.println(listset);
        }
        System.out.println();
        List<String> arraylist=new ArrayList<>(h_set);//convert hashset to arraylist
        System.out.println("Arraylist:-"+arraylist);
    }
}
