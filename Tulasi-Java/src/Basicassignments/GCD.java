package Basicassignments;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner myScannerObj = new Scanner(System.in);//scanner
        int num1, num2;
        int GCD = 0;

        System.out.println("Enter the num1 values : ");//num1 Validation

        do {
            while (!myScannerObj.hasNextInt()) {
                String input = myScannerObj.next();
                System.out.println("That's not a number!");
            }
            num1 = myScannerObj.nextInt();
            if (num1 <= 0)
                System.out.println("Please enter a positive number! ");
        } while (num1 <= 0);

        System.out.println("Enter the num2 value: "); //num2 Validation

        do {
            System.out.println("Please enter a positive number! ");
            while (!myScannerObj.hasNextInt()) {
                String input = myScannerObj.next();
                System.out.println("That's not a number!");
            }
            num2 = myScannerObj.nextInt();

        } while (num2 <= 0);

        while (num2 != 0) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }
        GCD = num1;
        System.out.println("GCD of two numbers : "+GCD);
        myScannerObj.close();//Scanner Close
    }
}
