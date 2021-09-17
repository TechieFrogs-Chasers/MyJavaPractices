package JavaBasicsAssignments;

import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {

        int first,second;

        Scanner scannerobj = new Scanner(System.in);

        //validation for first integer

        do{
            System.out.println("Enter first  integer");

           while (!scannerobj.hasNextInt() ){
               scannerobj.next();
               System.out.println("  is not a valid type");
             }
             first = scannerobj.nextInt();
           } while (first<=0);
    
        //validation for the second integer
        
           do{
            System.out.println("Enter second  integer");
           while (!scannerobj.hasNextInt() ){
               String input = scannerobj.next();
               System.out.println(input+"  is not a valid type");
             }
             second = scannerobj.nextInt();
           } while (second<=0);

   if(first!=second)
   if( first > second)
   first=first - second;
   else
   second = second-first;
   System.out.println( "GCD of given numbers is :  "+second);


scannerobj.close();




    }
    
}
