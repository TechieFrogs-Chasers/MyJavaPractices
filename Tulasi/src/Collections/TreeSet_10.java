package Collections;
//Write a Java program to get the element in a tree set which is greater than or equal to the given element.
import java.util.TreeSet;

public class TreeSet_10 {
    public static void main(String[] args) throws Exception {
        try {
            TreeSet<Integer> t_Set = new TreeSet<>();//Creating a treeset object
            t_Set.add(22);
            t_Set.add(55);
            t_Set.add(58);
            t_Set.add(86);
            t_Set.add(99);
            t_Set.add(45);
            System.out.println("Original treeset elements- \n" + t_Set);
            int value=t_Set.ceiling(0);//to get nearest number for given number
            System.out.println("Celing value for 0 is-"+ value);
        }catch (NullPointerException ne){
            System.out.println("NullPointerException");
        }
    }
}