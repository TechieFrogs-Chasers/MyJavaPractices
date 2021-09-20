package Assignment1;

import java.util.Scanner;


/*public class VowelConsonant {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("enter any character");
      char ch = input.next().charAt(0); 
      
      switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U': 
            
        System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");

            input.close();
    }
}
    }*/




public class VowelConsonant {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      char x;
      
      do{
          System.out.println("enter any alphabet");
          while(input.hasNextInt()){
              String s = input.next();
              System.out.println(s+ "is not a valid character");
            } 
             x=  input.next().charAt(0); 
        } while(x<=0);

        

        switch (x) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U': 
        
        System.out.println(x + " is vowel");
                break;
            default:
                System.out.println(x + " is consonant");
        }

            input.close();
    }

}
        
            
           


