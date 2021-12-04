package Collections.ListAssignment;

import java.util.ArrayList;

//10.WAP to compare 2 Array Lists?
public class Assignment_10 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(3);
        al.add(1);
        al.add(5);
        al.add(7);
        al.add(9);
        al.add(0);
        al.add(3);
        al.add(3);
        al.add(8);
        al.add(2);
        System.out.println("Original elements list 1: " + al);
        ArrayList<Integer> mulal = new ArrayList<>();
        mulal.add(3);
        mulal.add(1);
        mulal.add(5);
        mulal.add(2);
        mulal.add(7);
        mulal.add(2);
        mulal.add(5);
        mulal.add(9);
        mulal.add(1);
        mulal.add(6);
        System.out.println("Original elements list 2: " + mulal);

        boolean compare=al.equals(mulal);
        if(compare){
            System.out.println("Two ArrayLists are equal!");
        }else{
            System.out.println("Two ArrayLists are not equal!");
        }

    }
}
