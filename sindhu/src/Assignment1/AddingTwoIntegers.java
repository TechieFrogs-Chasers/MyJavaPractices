package Assignment1;

import java.util.Scanner;

public class AddingTwoIntegers {
    public static void main(String[] args) {
        int a,b;
        Scanner input = new Scanner(System.in);

        //validation method for first integer

        do{
            System.out.println("Enter first  integer");

           while (!input.hasNextInt())
            {
               String x = input.next();
               System.out.println(x+"  is not a valid type");
            }
             a = input.nextInt();
          } while (a<=0);
    
        //validation method for the second integer
        
        do{
            System.out.println("Enter second  integer");
           while (!input.hasNextInt())
            {
             String y = input.next();
               System.out.println(y+"  is not a valid type");
            }
             b = input.nextInt();
          } while (b<=0);
       
       int sum;
        sum = (a  +  b);

        System.out.println("Addition of these integers is:  "+ sum);
        
        
        input.close();
    }
}
