package Collections;
//Write a Java program to check if a particular element exists in a linked list.
import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_22 {
    public static void main(String[] args) {
        LinkedList<String> lls = new LinkedList<>();
        lls.add("Red");
        lls.add("Blue");
        lls.add("White");
        lls.add("Green");
        System.out.println(lls);

        if(lls.contains("Blue")){
            System.out.println("This particular element is exist in this linked list!");
        }else {
            System.out.println("This particular element is does not exist in this linked list!");
        }

        if(lls.contains("Black")){
            System.out.println("This particular element is exist in this linked list!");
        }else {
            System.out.println("This particular element is does not exist in this linked list!");
        }

    }
}
