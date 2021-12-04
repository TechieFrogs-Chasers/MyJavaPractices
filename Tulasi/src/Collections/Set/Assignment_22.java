package Collections.Set;

import java.util.TreeSet;

//22.Add heterogeneous elements to a TreeSet.
public class Assignment_22 {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet<>();
        ts.add(11);
        ts.add(22);
        ts.add(33);
        ts.add(44);
        ts.add(55);
        ts.add(new String("Name"));//TreeSet allows only homogeneous objects not heterogeneous objects.
        System.out.println("Original set: "+ ts);
    }
}
