package Basicassignments;

import java.util.Scanner;

public class ComputeQandR {
    public static void main(String[] args) {
        Scanner myScannerObj = new Scanner(System.in);//Scanner
        int dividend, divisor;
        System.out.println("Enter first value: ");

        do {//Validation

            while (!myScannerObj.hasNextInt()) {
                String input = myScannerObj.next();
                System.out.println("That's not a number!");
            }
            dividend = myScannerObj.nextInt();
            if (dividend < 0)
                System.out.println("Please enter a positive number! ");
        }
        while (dividend < 0);

        System.out.println("Enter second value: ");

        do {//Validation

            while (!myScannerObj.hasNextInt()) {
                String input = myScannerObj.next();
                System.out.println("That's not a number!");
            }
            divisor = myScannerObj.nextInt();
            if (divisor < 0)
                System.out.println("Please enter a positive number! ");
        }
        while (divisor < 0);
        System.out.println("Quotient = " + dividend / divisor);
        System.out.println("Remainder = " + dividend % divisor);
        myScannerObj.close();//Scanner Close

    }

}
