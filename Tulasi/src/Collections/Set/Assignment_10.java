import java.util.HashSet;

//10.Copy one HashSet to another HashSet?
public class Assignment_10 {
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<String>();
        hs.add("B");
        hs.add("L");
        hs.add("U");
        hs.add("E");

        System.out.println(hs);
        hs.clone();
        System.out.println(hs);

        HashSet<String> copyset = new HashSet<String>(hs);
        System.out.println("Copy HashSet: "+copyset);
    }
}
