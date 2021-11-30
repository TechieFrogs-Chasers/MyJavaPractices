package Collections.ListAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

//12.WAP to convert array to ArrayList and vice-versa?
public class Assignment_12 {

    public static void main(String[] args) {
        //Converting array to ArrayList
        String[] array = {"Red", "Blue", "White", "Black", "Pink"};
        List<String> list = Arrays.asList(array);
        System.out.println("Converting array to ArrayList -"+list);

        //Converting ArrayList to array
        List<String> l=new ArrayList<>();
        l.add("Red");
        l.add("Green");
        l.add("Blue");
        l.add("Black");
        System.out.println("Orignial elements list: "+l);
        System.out.println("Converting ArrayList to array-");
        Object[] object=l.toArray();
        for (Object obj:object){
            System.out.print(obj+" ");

        }
    }
}
