package Collections;

import java.util.TreeSet;

//Write a Java program to get the element in a tree set which is less than or equal to the given element.
public class TreeSet_11 {
    public static void main(String[] args) throws Exception {
        try
        {
            TreeSet<Integer> t_set=new TreeSet<>();//to check number is greater than or equal to- we use instanceObj.floor().
            t_set.add(99);
            t_set.add(45);
            t_set.add(88);
            t_set.add(75);
            t_set.add(99);

            System.out.println("Which number is less than or equal to the given number- "+t_set.floor(80));
            System.out.println("Which number is less than or equal to the given number- "+t_set.floor(100));
            System.out.println("Which number is less than or equal to the given number- "+t_set.floor(45));
        }catch (NullPointerException ne){
            System.out.println(ne);
        }finally {
            System.out.println("Final statement!");
        }
    }
}
