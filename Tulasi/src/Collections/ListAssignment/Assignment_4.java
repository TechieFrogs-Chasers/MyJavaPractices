package Collections.ListAssignment;

import java.util.ArrayList;
import java.util.List;

//4.WAP to remove duplicates from Array List?
public class Assignment_4 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("Red");
        al.add("Green");
        al.add("Blue");
        al.add("Black");
        al.add("Red");
        al.add("Blue");
        al.add("Black");
        System.out.println("Orignial elements: "+al);

        List<String> listal=new ArrayList<>();
        for (String allist: al){
            if(!listal.contains(allist)){
                listal.add(allist);

            }
        }System.out.println("After removing duplicates from Array List-");
        for (String allist: listal)
        {
            System.out.println(allist);
        }
    }
}
