package Collections.ListAssignment;

import java.util.ArrayList;
import java.util.Collections;

//13.WAP to convert ArrayList to String Array and vice-versa?
public class Assignment_13 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("Red");
        al.add("Green");
        al.add("Blue");
        al.add("Black");
        System.out.println("Orignial elements list1: "+al);
        // Converting an ArrayList of String to a String array
        int size=al.size();
        String[] string=al.toArray(new String[size]);
        System.out.println("Converting an ArrayList of String to a String array-");
        for(String s:string){
            System.out.print(s+" ");
        }
        System.out.println();
        // Converting an String array to ArrayList
        System.out.println("Converting an String array to ArrayList-");
        String[] str={"Red","Green","Blue","Black"};
        ArrayList<String> als=new ArrayList<>();
        Collections.addAll(als,str);
        for(String arr:als){
            System.out.println(arr);
        }

    }
}
