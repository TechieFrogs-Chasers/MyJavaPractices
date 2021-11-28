package Collections;

import java.util.ArrayList;

// Write a Java program to increase the size of an array list.
public class ArrayList_20 {
    public static void main(String[] args) {

        ArrayList<String> als_List1 = new ArrayList<>();
        als_List1.add("Red");
        als_List1.add("Blue");
        als_List1.add("White");
        System.out.println("arrayList1-\n" + als_List1);

        als_List1.ensureCapacity(6);

        als_List1.add("Green");
        als_List1.add("Black");
        als_List1.add("Pink");

        System.out.println("After increasing the capacity of an arraylist1 the current list size-\n"+als_List1);

    }
}
