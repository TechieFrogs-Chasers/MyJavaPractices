package Collections;

import java.util.ArrayList;
import java.util.Collections;

//Write a Java program to join two array lists
public class ArrayList_15 {
    public static void main(String[] args) {
        ArrayList<String> als_List1 = new ArrayList<>();
        als_List1.add("Red");
        als_List1.add("Blue");
        als_List1.add("White");
        als_List1.add("Green");
        als_List1.add("Black");
        als_List1.add("Pink");
        System.out.println("Before adding the elements on arrayList1 and arraylist2-\n"+als_List1);

        ArrayList<String> als_List2 = new ArrayList<>();
        als_List2.add("Dark");
        als_List2.add("Light");
        als_List2.add("Bright");
        als_List2.add("Shadow");
        System.out.println("Before adding the elements on arrayList1 and arraylist2-\n"+als_List2);

        ArrayList<String> als_List3 = new ArrayList<>();
        als_List3.addAll(als_List1);
        als_List3.addAll(als_List2);
        System.out.println("After adding the elements on arrayList1 and arraylist2-\n"+als_List3);

    }
}
