import java.util.HashSet;

//Check particular element exist or not in Hash Set?
public class Assignment_6 {
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("B");
		hs.add("L");
		hs.add("U");
		hs.add("E");
		
		System.out.println(hs);
		boolean result=hs.contains("U");
		System.out.println( "Particular element exist or not in Hash Set: "+result);
	}
}
