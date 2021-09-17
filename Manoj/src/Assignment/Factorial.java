//package Assignment;

import java.util.Scanner;
public class Factorial {
    public static void main(String...args){
        Scanner object=new Scanner(System.in);
        int num;
        int factorial=1;
        int i ;
         do {
             System.out.println(" enter the positive number");
             while (!object.hasNextInt())
             {
                 System.out.println("this is not a number .please enter a valid number ");
                 object.next();

             }num=object.nextInt();
         }while(num<=0);

          for (i=1;i<=num;i++){
            factorial=factorial*i;
          }
          System.out.println("factorial  of " + num + "is " +factorial);
    }

    
}
