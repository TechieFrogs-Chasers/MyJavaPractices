package TcsPaperPractices;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        int sum; //variable declaration
             Scanner myObj = new Scanner(System.in); //Object Declaration
             int a = SumOfTwoNumbers.validatePositiveNumber(myObj); //Variable initialization with validation
             System.out.println("Enter A ="+a);
             int b = SumOfTwoNumbers.validatePositiveNumber(myObj); // method call
             System.out.println("Enter B ="+b);
             sum = add(a,b); //function call
             System.out.println("SUM OF A and B  is  "+ sum);
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
     static int add(int a ,int b) //add method definition
     {
     return a+b; //return statement
     }
}
