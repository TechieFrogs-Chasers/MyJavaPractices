package Practices;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("White");//add() method
        al.add("Black");
        al.add("Blue");
        al.add("Pink");
        al.add("Red");
        al.add("Brown");
        al.add("Yellow");

        ArrayList<String> al1=new ArrayList<>();
        al1.add("Green");
        al1.add("Red");
        al1.add("Brown");
        al1.add("Yellow");
        al1.add(2,"Light Pink");//add(index,object) method

        System.out.println(al);
        System.out.println(al1);
        System.out.println("al: "+al.size()+" , "+"al1: "+al1.size() );//size() method
        al.addAll(al1);//addAll() method
        System.out.println(al);
        al.retainAll(al1);//retainAll() method will use to collect common objects from 2 ArrayList.
        System.out.println(al);
        System.out.println("get(index) -" +al1.get(3));//get(index) will show the index of the object

        al.trimToSize();
        System.out.println(al);

        System.out.println(al.contains("Red"));//contains() method show boolean value.
        System.out.println(al.containsAll(al1));//containsAll() method show boolean values.
        System.out.println(al.equals(al1));//equal() method verifies two ArrayList is same are not.
        System.out.println(al.clone());
        System.out.println(al.remove(4));//remove(index) will show index of an object that had to remove.
        System.out.println(al.remove("Pink"));//remove(object)will show object that has to remove by boolean.
        System.out.println(al.isEmpty());//isEmpty() checks is element is empty or not
        System.out.println(al.toArray());
        System.out.println(al.hashCode());
        System.out.println(al.toString());
        System.out.println(al.indexOf("Light Pink"));//indexOf() method will be used to find the in
        System.out.println(al.lastIndexOf(al));
        System.out.println(al.subList(1,5));//subList() method
        System.out.println(al.spliterator());
        al.removeAll(al1);//removeAll() method will be use to remove all elements in arraylist.
        System.out.println(al);
        al.clear();
        System.out.println(al);

    }
}
