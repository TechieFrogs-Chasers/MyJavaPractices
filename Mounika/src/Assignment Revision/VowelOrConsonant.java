import java.util.Scanner;

import Strings.String;
public class VowelOrConsonant {
    public static void main(String[] args) {
        
            Scanner scObj = new Scanner(System.in);
                char ch;
                do{
                    System.out.println("Enter an Alphabet");
                    
                    while(scObj.hasNextInt()){
                        
                        String input = scObj.next();
                        System.out.println("Not A Valid Character");
                        System.out.println("Enter Valid Character");
                    }
                    ch = scObj.next().charAt(0);

                }while((ch>=91 | ch<=96) || (ch<=65) | (ch>122)); 
                    switch(ch){
                        case 'A', 'E', 'I', 'O', 'U' : System.out.println(" Upper case Vowel");
                        case 'a','e','i','o','u' : System.out.println("Lower case vowels");
                        default:
                        System.out.println(" Given Alphabet is a Consonants");
                    }
                    scObj.close();

    }
}
