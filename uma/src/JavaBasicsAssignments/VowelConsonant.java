package JavaBasicsAssignments;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {

        Scanner VowelConsonantobj = new Scanner(System.in);
        String alpha;
        do{
            System.out.println("enter your character:");
           while(!VowelConsonantobj.hasNext() ){
               String input=VowelConsonantobj.next();
               System.out.println(input+"  is not a valid type");
               while(!VowelConsonantobj.hasNextInt() );
              // String input=VowelConsonantobj.next();
               System.out.println(input+"  is not a valid type");
             }
             alpha=VowelConsonantobj.next();
           } while(alpha=="a,e,i,o,u");













     VowelConsonantobj.close();
    }
    
}
