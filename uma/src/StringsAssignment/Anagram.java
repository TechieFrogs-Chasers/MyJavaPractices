import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        
      String s1 = "race";
      String s2 = "cape";

      s1= s1.toLowerCase();
      s2= s2.toLowerCase();

      if(s1.length()==s2.length()){
       
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        boolean b = Arrays.equals(charArray1, charArray2);

        if (b==true)
        System.out.println(s1+ " and  "+ s2 +"  are anagrams");
        else
        System.out.println(s1+ " and  "+ s2 +"  are not anagrams");

        
      }
    }
    
}
