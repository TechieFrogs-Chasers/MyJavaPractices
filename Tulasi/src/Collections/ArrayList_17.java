package Collections;

import java.util.ArrayList;
import java.util.Collections;

//Write a Java program to empty an array list.
public class ArrayList_17 {
    public static void main(String[] args) {
        ArrayList<String> als_List1 = new ArrayList<>();
        als_List1.add("Red");
        als_List1.add("Blue");
        als_List1.add("White");
        als_List1.add("Green");
        als_List1.add("Black");
        als_List1.add("Pink");
        System.out.println("Before empty an arrayList1-\n" + als_List1);

        als_List1.removeAll(als_List1);
        System.out.println("After empty an arraylist1 -\n"+ als_List1);

    }
}
