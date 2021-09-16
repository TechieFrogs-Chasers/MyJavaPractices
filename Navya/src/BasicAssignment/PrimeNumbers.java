package BasicAssignment;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {    
    Scanner myObj = new Scanner(System.in); // creating scanner object
    //System.out.println("Enter positive Number:");
    int num;
     do{
       System.out.println("please enter a positive number:");
         while (!myObj.hasNextInt()) { // if object was not an integer than goes to print Statement
           String input = myObj.next(); // to print String from end user
           System.out.println( input +"  This is an valid number,please enter valid number");
         }
           num = myObj.nextInt();
       }
         while( num <= 0);
         for ( int i = 2 ; i < num/2; i++ ){
             if(num % i == 0){
             System.out.println("not a prime");
             }
              else{
                System.out.println("it is prime ");
              }
        }      

    }
}