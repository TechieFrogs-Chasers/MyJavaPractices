package Collections;
//Write a Java program to compare two tree sets
import java.util.TreeSet;

public class TreeSet_8 {
    public static void main(String[] args) {
        TreeSet<String> t_Set=new TreeSet<>();
        t_Set.add("Red");
        t_Set.add("Blue");
        t_Set.add("White");
        t_Set.add("Green");
        t_Set.add("Pink");
        t_Set.add("Yellow");
        System.out.println("First treeset elements- \n"+t_Set);

        TreeSet<String> t_Set1=new TreeSet<>();
        t_Set1.add("Dark");
        t_Set1.add("Blue");
        t_Set1.add("Sun");
        t_Set1.add("Green");
        t_Set1.add("Afternoon");
        t_Set1.add("Yellow");
        System.out.println("Second treeset elements- \n"+t_Set1);

        for(String set:t_Set){
            System.out.println(t_Set1.contains(set)?"Yes":"No");
        }
    }
}
