package JavaBasicsAssignments;

import java.util.Scanner;

public class factorialNumber {
    public static void main(String[] args) {

      System.out.println("Find the factorial value of a given number");

       Scanner FactorialNumberobj = new Scanner(System.in);   
        
       int num;
       int fact=1;
       int i;
       
       do{
        System.out.println("Enter first  integer");

       while (!FactorialNumberobj.hasNextInt() ){
           String input = FactorialNumberobj.next();
           System.out.println(input+"  is not a valid type");
         }
         num = FactorialNumberobj.nextInt();
       } while (num<=0);

       FactorialNumberobj.close();

          for( i=1;i<=num;i++)

        {
            fact= fact * i;
        }
       System.out.println("The Factorial of number  " +num+ "  is:  "+fact);

      

       
    }
    
}
