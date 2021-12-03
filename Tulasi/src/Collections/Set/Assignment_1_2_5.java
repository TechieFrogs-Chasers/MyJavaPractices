import java.util.HashSet;
import java.util.Iterator;

//How to create Hash Set object with an example?
//How to store object into Hash Set with an example?
//How to add elements to HashSet in Java dynamically?
public class Assignment_1_2_5 {
public static void main(String[] args) {
 HashSet<String> hs=new HashSet<String>();
	hs.add("B");
	hs.add("L");
	hs.add("U");
	hs.add("E");
	
	System.out.println(hs);
	
	Iterator<String> i=hs.iterator();
	while (i.hasNext()) {
		System.out.println( i.next());	
	}
}
}
