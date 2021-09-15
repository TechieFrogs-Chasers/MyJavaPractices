package JavaBasicsAssignments;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {

        System.out.println("Find the factorial value of a given number");

       Scanner FactorialNumberobj = new Scanner(System.in);   
        
       int num;
       int fact=1;
       int i;
        do{
            System.out.println("enter your number:");

           while(!FactorialNumberobj.hasNextInt() ){
              FactorialNumberobj.next();

               System.out.println("  is not a valid type");
             }
             num=FactorialNumberobj.nextInt();
             } while(num<=0);


          for( i=1;i<=num;i++)

        {
            fact= fact * i;
        }
       System.out.println("The Factorial of number  " +num+ "  is:  "+fact);


       FactorialNumberobj.close();
      

    }
    
}
