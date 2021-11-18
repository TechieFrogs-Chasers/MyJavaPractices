package Collections;

import java.util.ArrayList;
import java.util.Collections;

// Write a Java program to replace the second element of a ArrayList with the specified element.
public class ArrayList_21 {
    public static void main(String[] args) {

        ArrayList<String> als_List1 = new ArrayList<>();
        als_List1.add("Red");
        als_List1.add("Blue");
        als_List1.add("White");
        als_List1.add("Green");
        als_List1.add("Black");
        als_List1.add("Pink");
        System.out.println("arrayList1-\n" + als_List1);

        String replace = "Royal White";
        als_List1.set(2, replace);

        System.out.println("arrayList1-\n" + als_List1);


    }
}
