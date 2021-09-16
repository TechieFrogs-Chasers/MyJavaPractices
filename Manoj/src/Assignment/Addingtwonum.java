package Assignment;

import java.util.Scanner;

public class Addingtwonum {
    public static void main(String...args){
         Scanner object=new Scanner(System.in);      //created an scanner object 

            System.out.println("enter the value of num1: ");
            int num1 = Addingtwonum.validatenumber(object);

                   System.out.println("enter the value of num2: ");
                   int num2 =Addingtwonum.validatenumber(object);

            int sum= num1+ num2 ;
            System.out.println("sum of 2 nums : " + sum );

         object.close(); //object close 

    }
    static int validatenumber (Scanner object){  //here we used a method of validate 
        int num ;
     do {
            System.out.println("enter the positive number ");
            while (!object.hasNextInt())
            {
                System.out.println("this is not number .please enter a valid number");
                object.next();

            }num=object.nextInt();
            while(num<=0);
            return num; //  return is used to exit from the method 

        }
    }
    
}
