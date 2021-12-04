package Collections.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//13.Get particular element in given HashSet?
public class Assignment_13 {

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        System.out.println(set);
        List<String> list = new ArrayList<String>(set);
        System.out.println("Element at index 2 is: " + list.get(2));

        /*HashSet<String> hs1 = new HashSet<String>();

		hs1.add("Umadevi");
		hs1.add("Ram");
		hs1.add("Varshitha");
		hs1.add("Tulasi");
		hs1.add("Dhivya");

		String s= "Ram";
		for(String temp:hs1)
		{
			if(temp==s)
				System.out.println(s);
			break;
		}*/
    }
}

