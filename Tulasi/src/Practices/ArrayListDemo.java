package Practices;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList <String> al=new ArrayList<>();//ArrayList <String> al=new ArrayList<String>();
        al.add("Java ");
        al.add("is ");
        al.add("hardest ");
        al.add("language!");
        al.add("java ");//Arraylist accepts repated inputs.
        al.add(null);//Arraylist accepts null.
        al.add(" ");//Add empty space also.
        System.out.println(al);//It shows array formate/
        for (String details:al)
        System.out.print(details);
       /* for(int i=0;i<al.size();i++){
            System.out.println(i);
        }*/
    }
}
