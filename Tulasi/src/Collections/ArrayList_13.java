package Collections;
//Write a Java program to compare two array lists.
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_13 {
    public static void main(String[] args) {
        ArrayList<String> als_List1 = new ArrayList<>();
        als_List1.add("Red");
        als_List1.add("Blue");
        als_List1.add("White");
        als_List1.add("Green");
        als_List1.add("Black");
        als_List1.add("Pink");
        System.out.println("List1-\n"+als_List1);
        ArrayList<String> als_List2 = new ArrayList<>();
        als_List2.add("Pink");
        als_List2.add("Blue");
        als_List2.add("Green");
        als_List2.add("White");
        als_List2.add("Red");
        als_List2.add("Black");
        System.out.println("List2-\n"+als_List2);
        /* Collections.sort(als_List1);
           Collections.sort(als_List2);
           boolean isEqual=als_List1.equals(als_List2);
           System.out.println("List1 is equal to list2- "+isEqual);*/

        ArrayList<String> als_List3 = new ArrayList<>();
        for (String als:als_List1)
            als_List3.add(als_List2.contains(als)?"Yes":"No");
            System.out.println(als_List3);

     }
}

