package Collections.ListAssignment;

import java.util.ArrayList;
import java.util.Iterator;

//31.WAP to traverse or iterate the Array List?
public class Assignment_31 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("Red");
        al.add("Green");
        al.add("Blue");
        al.add("Black");
        Iterator<String> il=al.iterator();
        while (il.hasNext()){
            System.out.println(il.next());
        }
    }
}
