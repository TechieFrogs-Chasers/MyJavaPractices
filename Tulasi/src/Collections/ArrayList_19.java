package Collections;

import java.util.ArrayList;

//Write a Java program to trim the capacity of an array list the current list size.
public class ArrayList_19 {
    public static void main(String[] args) {

        ArrayList<String> als_List1 = new ArrayList<>();
        als_List1.add("Red");
        als_List1.add("Blue");
        als_List1.add("White");
        als_List1.add("Green");
        als_List1.add("Black");
        als_List1.add("Pink");
        System.out.println("arrayList1-\n" + als_List1);
        als_List1.trimToSize();
        System.out.println("After trim the capacity of an arraylist1 the current list size"+als_List1);

    }

}
