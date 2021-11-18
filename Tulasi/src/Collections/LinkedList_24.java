package Collections;

import java.util.Collections;
import java.util.LinkedList;

//Write a Java program to compare two linked lists.
public class LinkedList_24 {
    public static void main(String[] args) {
        LinkedList<String> lls = new LinkedList<>();
        lls.add("Red");
        lls.add("Blue");
        lls.add("White");
        lls.add("Green");
        System.out.println(lls);

        LinkedList<String> lls1 = new LinkedList<>();
        lls1.add("Black");
        lls1.add("Pink");
        lls1.add("White");
        lls1.add("Orange");
        System.out.println(lls1);

      /*  if(lls==lls1){
            System.out.println("Both linked list elements are same!");
        }else {
            System.out.println("Both linked list elements are not same!");
        }*/
        LinkedList<String> lls2 = new LinkedList<>();
        for (String compare:lls)
            lls2.add(lls1.contains(compare)?"Yes":"No");
            System.out.println(lls2);
    }
}
