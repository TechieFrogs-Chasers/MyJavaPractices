package BasicAssignment;

import java.util.Scanner;

public class LcmOfNumbers {
     public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int a = GcdOfNumbers.validateGcd(myObj); //Variable initialization with validation
        System.out.println("Enter A ="+a);
        int b = GcdOfNumbers.validateGcd(myObj); // method call
        System.out.println("Enter B ="+b);
         myObj.close();
         System.out.println("GCD OF " + a +" and "+b +" is "+findGcd(a, b));
         int lcm = (a * b)/findGcd(a, b); 
         System.out.println("LCM of " + a + " and " + b + " is "+ lcm);     
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
