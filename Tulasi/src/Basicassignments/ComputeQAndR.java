package Basicassignments;

import java.util.Scanner;

public class ComputeQAndR {
    public static void main(String[] args) {
        Scanner myScannerObj = new Scanner(System.in);//Scanner
        int dividend, divisor;

        System.out.println("Enter first value: ");
        do {//Validation
            System.out.println("Please enter a positive number! ");
            while (!myScannerObj.hasNextInt()) {
                String input = myScannerObj.next();
                System.out.println("That's not a number!");
            }
            dividend = myScannerObj.nextInt();
        }
        while (dividend < 0);

        System.out.println("Enter second value: ");
        do {//Validation
            System.out.println("Please enter a positive number! ");
            while (!myScannerObj.hasNextInt()) {
                String input = myScannerObj.next();
                System.out.println("That's not a number!");
            }
            divisor = myScannerObj.nextInt();

        }
        while (divisor < 0);
        System.out.println("Quotient = " + dividend / divisor);
        System.out.println("Remainder = " + dividend % divisor);
        myScannerObj.close();//Scanner Close

    }

}
