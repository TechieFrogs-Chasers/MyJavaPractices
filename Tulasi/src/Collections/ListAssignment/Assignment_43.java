package Collections.ListAssignment;

import java.util.*;
import java.util.stream.Collectors;

//How to remove duplicates from a Linked List in Java?
public class Assignment_43 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>(Arrays.asList(7,8,90,6,8,9,4,2,1,80));
       //Set s= new HashSet(ll);
        System.out.println(ll);
        Set<Integer> dup=ll.stream().collect(Collectors.toSet());
        System.out.println(dup);

    }
}
