package JavaBasicsAssignments;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {

        Scanner VowelConsonantobj = new Scanner(System.in);
        String ch;
        int num;
        do{
            System.out.println("enter your alphabet:");
           while(!VowelConsonantobj.hasNext() ){
               //String alpha=VowelConsonantobj.next();
               int input=VowelConsonantobj.nextInt();
               System.out.println(input+"  is not a valid type");
             }
             num=VowelConsonantobj.nextInt();
           } while(num>=0);











     VowelConsonantobj.close();
    }
    
}
