package Strings;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        

        String x = "RACE";
        String y = "care";

        x = x.toLowerCase();
        y = y.toLowerCase();

        if(x.length() == y.length()){

            char[] c1 = x.toCharArray();
            char[] c2 = y.toCharArray();

            //sort the char array
          Arrays.sort(c1);
            Arrays.sort(c2);

            boolean z = Arrays.equals(c1,c2);

            if(z){

                System.out.println(x + " " + y + "are anagram");
            }
            else {

                System.out.println(x + " " + y + "are not anagram");
            }


            
        }
        else {

            System.out.println(x + " " + y + "are not anagram");
        }
    }
    
}
