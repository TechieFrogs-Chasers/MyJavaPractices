package Assignement-1;

import java.util.Scanner;

public class Addingtwonum {
    public static void main(String...args){
         Scanner object=new Scanner(System.in);      //created an scanner object 

            System.out.println("enter the value of num1: ");
            int num1 = object.nextInt();

                   System.out.println("enter the value of num2: ");
                   int num2 = object.nextInt();

            int sum= num1+ num2 ;
            System.out.println("sum of 2 nums : " + sum );

         object.close();

    }
    
}
