package BasicAssignment;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); //Object Declaration
        int a = AdditionOfIntegers.validatePositiveNumber(myObj); //Variable initialization with validation
        System.out.println("Enter A ="+a);
        int b = AdditionOfIntegers.validatePositiveNumber(myObj); // method call
        System.out.println("Enter B ="+b);
        int c = AdditionOfIntegers.validatePositiveNumber(myObj);
        System.out.println("Enter C ="+c);
        myObj.close(); //OBject closing
        if (a > b && a > c){
            System.out.println(a+" It is a largest number");
        }
        else if (b > a && b > c){
            System.out.println(b+ " It is a largest number");
        }
        else if (c > a && c >b){
            System.out.println(c+" It is a largest number");
        }
        else 
        System.out.println("All are equal");
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
        
}