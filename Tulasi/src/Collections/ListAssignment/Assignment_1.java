package Collections.ListAssignment;

import java.util.ArrayList;
import java.util.Iterator;

//1.WAP to add elements to Array List Dynamically?
public class Assignment_1 {
    public static void main(String[] args) {

        ArrayList<String> al=new ArrayList<>();
        al.add("Red");
        al.add("Green");
        al.add("Blue");
        al.add("Black");
        System.out.println("Orignial elements: "+al);
        System.out.println("------------Iterator-------------");
        Iterator<String> iteratorlist=al.iterator();
        while (iteratorlist.hasNext()){
            System.out.println(iteratorlist.next());
        }
        System.out.println("-----------Enchancement for loop------------");
        for(String temp:al){
            System.out.println(temp);
        }
    }
}
