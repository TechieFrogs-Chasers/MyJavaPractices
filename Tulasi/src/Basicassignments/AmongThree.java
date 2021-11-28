package Basicassignments;

import java.util.Scanner;

public class AmongThree {
    public static void main(String[] args) {//main method
        Scanner myScannerObj = new Scanner(System.in);//Scanner
        int num1, num2, num3;

        //a Validation
        System.out.println("Enter the numbers num1 : ");
        do {
            System.out.println("Please enter a positive number! ");
            while (!myScannerObj.hasNextInt()) {
                String input = myScannerObj.next();
                System.out.println("That's not a number!");
            }
            num1 = myScannerObj.nextInt();

        }
        while (num1 <= 0);

        //b Validation
        System.out.println("Enter the numbers num2: ");
        do {
            System.out.println("Please enter a positive number! ");
            while (!myScannerObj.hasNextInt()) {
                String input = myScannerObj.next();
                System.out.println("That's not a number!");
            }
            num2 = myScannerObj.nextInt();
        }
        while (num2 <= 0);

        //c Validation
        System.out.println("Enter the numbers num3: ");
        do {
            System.out.println("Please enter a positive number! ");
            while (!myScannerObj.hasNextInt()) {//for not to allow string
                String input = myScannerObj.next();
                System.out.println("That's not a number!");
            }
            num3 = myScannerObj.nextInt();

        }
        while (num3 <= 0);

        //Condition
        if ((num1 > num3) && (num1 > num2)) {//condition checks if first value is greater than 2nd and 3rd values
            System.out.println(num1 + " " + "is largest among the three numbers.");
        } else if (num2 > num3) {//condition checks if second value is greater 3rd values
            System.out.println(num2 + " " + "is largest among the three numbers.");
        } else {//if both 1st and 2nd are less it takes 3rd as largest number
            System.out.println(num3 + " " + "is largest among the three numbers.");
        }
        System.out.println();
        myScannerObj.close();//Scanner Close
    }

}

