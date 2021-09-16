package JavaBasicsAssignments;

import java.util.Scanner;

public class vowelConsonant {
    public static void main(String[] args) {

        Scanner scannerobj = new Scanner(System.in);

        char ch;   
        
    do{
        System.out.println("Enter a character : ");

       while(scannerobj.hasNextInt() ){

          // int num=scannerobj.nextInt();
           System.out.println("Please enter valid character");
       }
       ch = scannerobj.next().charAt(0);

      // System.out.println((int)ch);
       
    }while(!((ch <= 65 && ch >= 90) || (ch >= 97 && ch <= 122)));
        
       switch(ch){
        
            case'a','e','i','o','u'->
               System.out.println(ch+" is a lower case vowel");
   
           case 'A','E','I','O','U'->
               System.out.println(ch+" is a upper case vowel");
           
   
           default->
               System.out.println(ch+"  is consonant");
           }
        scannerobj.close();
        


    }
    
}
