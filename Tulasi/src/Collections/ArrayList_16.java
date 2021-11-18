package Collections;

import java.util.ArrayList;
import java.util.Collections;

//Write a Java program to clone an array list to another array list.
public class ArrayList_16 {
    public static void main(String[] args) {
        ArrayList<String> als_List1 = new ArrayList<>();
        als_List1.add("Red");
        als_List1.add("Blue");
        als_List1.add("White");
        als_List1.add("Green");
        als_List1.add("Black");
        als_List1.add("Pink");
        System.out.println("Before clone an arrayList1-\n" + als_List1);

        ArrayList<String> als_List2 = (ArrayList<String>) als_List1.clone();
        System.out.println("After clone on arraylist1 to arraylist2-\n"+ als_List2);


    }
}
