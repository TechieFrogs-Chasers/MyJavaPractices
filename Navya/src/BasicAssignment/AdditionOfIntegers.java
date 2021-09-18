package BasicAssignment;

import java.util.Scanner;

public class AdditionOfIntegers {
public static void main(String[] args) {
       //Validating for one number//
       /* Scanner myObj = new Scanner(System.in); // creating scanner object
       System.out.println("enter value A:");
       int num1 ; // integer data type
      do{
          System.out.println("please enter a positive number:");
         while (!myObj.hasNextInt()) { // if object was not an integer than goes to print Statement
           String input = myObj.next(); // to print String from end user
           System.out.println( input +"  This is an valid number,please enter valid number");
       }
         num1 = myObj.nextInt();
    }
         while( num1 <= 0);*/
     /*
           if(myObj.hasNextInt()){
           int  value = myObj.nextInt();// print number from end user 
           if(value > 0){ // if entered number is greater than zero it goes print statment or goes to else if block
            System.out.println(value + " you have enter positive number");
            }
             else if(value <=0){ // if enterd number is lessthan zero it goes print Statement or goes to else block
              System.out.println(value +" you have enter negative number");
             }
        }
             else {
              System.out.println("Please enter valid number");
             }*/
             // myObj.close();
             //Validating for Two or more numbers//
             int sum; //variable declaration
             Scanner myObj = new Scanner(System.in); //Object Declaration
             int a = AdditionOfIntegers.validatePositiveNumber(myObj); //Variable initialization with validation
             System.out.println("Enter A ="+a);
             int b = AdditionOfIntegers.validatePositiveNumber(myObj); // method call
             System.out.println("Enter B ="+b);
             int c = AdditionOfIntegers.validatePositiveNumber(myObj);
             System.out.println("Enter C ="+c);
             sum = add(a,b,c); //function call
             System.out.println("SUM OF A and B and C is  "+ sum);
             myObj.close(); //OBject closing
    }
    static int validatePositiveNumber(Scanner myObj){ // method definition
        int num;
        do{
            System.out.println("Enter positive Number:");
            while(!myObj.hasNextInt()){
                System.out.println("This is not a Number.Please enter positive Number:");
                myObj.next();
            }
            num = myObj.nextInt();
        }while(num <= 0);
      return num;
    }
    static int add(int a ,int b, int c) //add method definition
 {
   return a+b+c; //return statement
 }
}

