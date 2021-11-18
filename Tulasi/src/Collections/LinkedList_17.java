package Collections;

import java.util.LinkedList;

//Write a Java program to join two linked lists.
public class LinkedList_17 {
    public static void main(String[] args) {
        LinkedList<String> lls = new LinkedList<>();
        lls.add("Red");
        lls.add("Blue");
        lls.add("White");
        lls.add("Green");
        System.out.println(lls);

        LinkedList<String> lls1 = new LinkedList<>();
        lls1.add("Orange");
        lls1.add("Pink");
        lls1.add("Black");
        lls1.add("Purple");
        System.out.println(lls1);

        lls.addAll(lls1);
        System.out.println(lls);


    }
}
