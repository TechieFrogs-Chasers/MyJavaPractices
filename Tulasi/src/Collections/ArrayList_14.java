package Collections;
//Write a Java program of swap two elements in an array list.

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_14 {
    public static void main(String[] args) {
        ArrayList<String> als_List1 = new ArrayList<>();
        als_List1.add("Red");
        als_List1.add("Blue");
        als_List1.add("White");
        als_List1.add("Green");
        als_List1.add("Black");
        als_List1.add("Pink");
        System.out.println("Before swapping the elements on arrayList1-\n"+als_List1);

        ArrayList<String> als_List2 = new ArrayList<>();
        als_List2.add("Dark");
        als_List2.add("Light");
        als_List2.add("Bright");
        als_List2.add("Shadow");
        System.out.println("Before swapping the elements on arrayList2-\n"+als_List2);

        Collections.swap(als_List1,0,5);
        System.out.println("After swapping the elements on arrayList1-\n"+als_List1);
        Collections.swap(als_List2,1,3);
        System.out.println("After swapping the elements on arrayList2-\n"+als_List2);

    }
}
