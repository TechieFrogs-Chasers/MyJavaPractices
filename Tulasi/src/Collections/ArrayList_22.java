package Collections;

import java.util.ArrayList;

//Write a Java program to print all the elements of a ArrayList using the position of the elements.
public class ArrayList_22 {
    public static void main(String[] args) {

        ArrayList<String> als_List1 = new ArrayList<>();
        als_List1.add("Red");
        als_List1.add("Blue");
        als_List1.add("White");
        als_List1.add("Green");
        als_List1.add("Black");
        als_List1.add("Pink");
        System.out.println("arrayList1-\n" + als_List1);

        int num=als_List1.size();
        for(int i=0;i<num;i++){
            System.out.println(als_List1.get(i));
        }
    }
}
