import java.util.HashSet;

//Remove particular element in given HashSet?
public class Assignment_7 {
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("B");
		hs.add("L");
		hs.add("U");
		hs.add("E");
		hs.add("S");
		System.out.println(hs);
		hs.removeAll(hs);
		System.out.println("Remove particular element in given HashSet: "+hs);
	}

}
