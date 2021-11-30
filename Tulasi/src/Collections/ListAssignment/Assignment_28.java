package Collections.ListAssignment;
//How do you insert an element at a particular position of an Array List?
import java.util.ArrayList;
import java.util.Iterator;

public class Assignment_28 {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(3);
        al.add(1);
        al.add(5);
        al.add(7);
        al.add(9);
        al.add(3);
        al.add(3);
        al.add(8);
        al.add(2);
        System.out.println("Orignial elements list : " + al);
        al.add(5,0);
        Iterator<Integer> it=al.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}