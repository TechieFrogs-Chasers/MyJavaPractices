package Collections;

import java.util.TreeSet;

//Write a Java program to get an element in a tree set which is strictly less than the given element.
public class TreeSet_13 {
    public static void main(String[] args) throws Exception {
        try
        {
            TreeSet<Integer> t_set=new TreeSet<>();//to check number is strictly less than or equal to -we use instanceObj.lower().
            t_set.add(99);
            t_set.add(45);
            t_set.add(88);
            t_set.add(75);
            t_set.add(99);

            System.out.println("Which number is less than or equal to the given number- "+t_set.lower(80));
            System.out.println("Which number is less than or equal to the given number- "+t_set.lower(100));
            System.out.println("Which number is less than or equal to the given number- "+t_set.lower(45));
        }catch (NullPointerException ne){
            System.out.println(ne);
        }finally {
            System.out.println("Final statement!");
        }
    }
}
