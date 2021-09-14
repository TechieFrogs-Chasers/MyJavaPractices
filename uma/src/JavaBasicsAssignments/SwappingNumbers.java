package JavaBasicsAssignments;

import java.util.Scanner;

public class SwappingNumbers {
    public static void main(String[] args) {
        

        int one,two;

        Scanner SwappingNumbersobj = new Scanner(System.in);

        //validation for one

        do{
            System.out.println("Enter first  integer");

           while (!SwappingNumbersobj.hasNextInt() ){

               String input = SwappingNumbersobj.next();

               System.out.println(input+"  is not a valid type");
             }
             one = SwappingNumbersobj.nextInt();

           } while (one<=0);

           System.out.println("first integer is:   "+one);


     //validation for two

           do{
            System.out.println("Enter second  integer ");

           // System.out.println("second integer is:   ");

           while (!SwappingNumbersobj.hasNextInt() ){

               String input = SwappingNumbersobj.next();

               System.out.println(input+"  is not a valid type");
             }
             two = SwappingNumbersobj.nextInt();

           } while (two<=0);

           System.out.println("second integer is:   "+two);
           
       one = one + two;
       two = one - two;

      System.out.println("Now the value of second integer after swapping is:  "+two);

      System.out.println("Thank you");
           SwappingNumbersobj.close();
       
    }
}
