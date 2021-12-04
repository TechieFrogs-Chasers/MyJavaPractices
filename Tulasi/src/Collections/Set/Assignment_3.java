import java.util.HashSet;
import java.util.Iterator;
//3.How check HashSet is empty or not with an example?
public class Assignment_3 {
	public static void main(String[] args) {
		HashSet <Integer> hs= new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		System.out.println("Original Elements: "+hs.isEmpty());
		Iterator<Integer> i=hs.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
