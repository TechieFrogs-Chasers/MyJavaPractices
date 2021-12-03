import java.util.HashSet;

//To Compare two HashSets?
public class Assignment_9 {
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("B");
		hs.add("L");
		hs.add("U");
		hs.add("E");
		hs.add("S");
		System.out.println("Original set1: "+ hs);
		HashSet<String> hs1=new HashSet<String>();
		hs1.add("G");
		hs1.add("R");
		hs1.add("E");
		hs1.add("E");
		hs1.add("N");
		System.out.println("Original set2:  "+ hs1);
		
		boolean result=hs.equals(hs1);
		System.out.println(result);
		
		if(hs==hs1)
			System.out.println("HashSet1 is equal to HashSet2 ");
		else
			System.out.println("HashSet1 is not equal to HashSet2");
	}

}
