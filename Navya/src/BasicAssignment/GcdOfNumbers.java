package BasicAssignment;

import java.util.Scanner;

public class GcdOfNumbers {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int a = GcdOfNumbers.validateGcd(myObj); //Variable initialization with validation
        System.out.println("Enter A ="+a);
        int b = GcdOfNumbers.validateGcd(myObj); // method call
        System.out.println("Enter B ="+b);
         myObj.close();
         System.out.println("GCD OF " + a +" and "+b +" is "+findGcd(a, b));
         //while (a != b) {
            //int gcd ;
            /*if (a > b) {
                  gcd = a-b;
                 System.out.println("GCD of two numbers is " +gcd);   
             }
             else if (a < b) {
                 gcd = b - a; 
                 System.out.println("GCD of two numbers is " + gcd);
             } else {
                 System.out.println("GCD of two numbers is null");
             }*/
             
         //}
    }
    
    static int validateGcd(Scanner myObj){
             int num;
         do{ 
            System.out.println("Please Enter Positive number:");
            while (!myObj.hasNextInt()) {
                String input = myObj.next();
                System.out.println(input+ " This not an integer, Please enter valid integer");
                myObj.next();
            }
            num =myObj.nextInt();
        }while(num <= 0);
        return num; 
    }
    static int findGcd(int a, int b){
        if (b == 0) 
        return a;
        return findGcd(b,a % b);
    } 
}
