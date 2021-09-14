package Basicassignments;

import java.util.Scanner;

public class ComputeQandR {
    public static void main(String[] args) {
        Scanner myscannerobj = new Scanner(System.in);//Scanner
        int dividend, divisor;
        System.out.println("Enter first value: ");

        do {//Validation

            while (!myscannerobj.hasNextInt()) {
                String input = myscannerobj.next();
                System.out.println("That's not a number!");
            }
            dividend = myscannerobj.nextInt();
            if (dividend < 0)
                System.out.println("Please enter a positive number! ");
        }
        while (dividend < 0);

        System.out.println("Enter second value: ");

        do {//Validation

            while (!myscannerobj.hasNextInt()) {
                String input = myscannerobj.next();
                System.out.println("That's not a number!");
            }
            divisor = myscannerobj.nextInt();
            if (divisor < 0)
                System.out.println("Please enter a positive number! ");
        }
        while (divisor < 0);
        System.out.println("Quotient = " + dividend / divisor);
        System.out.println("Remainder = " + dividend % divisor);
        myscannerobj.close();//Scanner Close

    }

}
