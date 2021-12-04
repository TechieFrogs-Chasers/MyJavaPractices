import java.util.HashSet;

//4.How to remove objects from HashSet with an example?
public class Assignment_4 {
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("B");
		hs.add("L");
		hs.add("U");
		hs.add("E");
		hs.add("S");
		System.out.println(hs);
		String obj="S";
		boolean result=hs.remove(obj);
		System.out.println(result);
		System.out.println(hs);
	}
}
