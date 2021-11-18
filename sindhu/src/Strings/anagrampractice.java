package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class anagrampractice {
    public static void main(String[] args) {
        
       /* String x = "sindhu";
        String y = "hayath";*/

        Scanner input = new Scanner(System.in);
        System.out.println("enter first string");

        String x = input.nextLine();

        System.out.println("enter second string");

        String y = input.nextLine();
        

        x = x.toLowerCase();
        y= y.toLowerCase();

        if(x.length()== y.length()){

            char[] c1 = x.toCharArray();
            char[] c2 = y.toCharArray();


            Arrays.sort(c1);
            Arrays.sort(c2);

            boolean z = Arrays.equals(c1,c2);

            if(z==true){

                System.out.println(x+ " "+ y + "are anagram");
            }
            else {

                System.out.println(x + " "+ y+ " "+ "are not anagram");
            }
        }
        else{
            System.out.println("not anagram");
        }
        input.close();
    }
    
}
