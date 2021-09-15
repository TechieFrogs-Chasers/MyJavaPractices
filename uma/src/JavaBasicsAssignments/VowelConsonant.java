package JavaBasicsAssignments;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {

        Scanner VowelConsonantobj = new Scanner(System.in);

        char ch=VowelConsonantobj.next().charAt(0);

       // char ch1=VowelConsonantobj.next().charAt(0);
       char ch1='a';
        
    do{
        System.out.println("Enter a character : ");

       while((VowelConsonantobj.hasNextInt() )){

           int num=VowelConsonantobj.nextInt();

     if(num>=65 ||num<=90){
         System.out.println("number is equivalent to alphabet");}
         else{
             System.out.println("not an alphabet");
         }
         
     
        switch(ch){
        
         case'a','e','i','o','u'->
            System.out.println(" is a lower case vowel");

        case 'A','E','I','O','U'->
            System.out.println(" is a upper case vowel");
        

        default->
            System.out.println(ch+"  is consonant");
        }
    } VowelConsonantobj.next();
    //char ch1=VowelConsonantobj.next().charAt(0);
        
        }while(ch==ch1);
        

     VowelConsonantobj.close();
        


    }
    
}
