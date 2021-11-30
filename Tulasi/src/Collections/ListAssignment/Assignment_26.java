package Collections.ListAssignment;

import java.util.ArrayList;

//26.How do you find out whether the given Array List is empty or not?
public class Assignment_26 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("Red");
        al.add("Green");
        al.add("Blue");
        al.add("Black");
        System.out.println("Orignial elements: "+al);
        boolean list=al.isEmpty();
        System.out.println("The given Array List is empty -"+list);
        al.clear();
        boolean lists=al.isEmpty();
        System.out.println("The given Array List is empty or not -"+lists);

    }
}
