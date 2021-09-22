package Basicassignments;

import java.util.Scanner;

public class AddTwoIntegers {

    public static void main(String[] args) {//main method
        Scanner myScannerObj = new Scanner(System.in);//Scanner
        int i, j;//datatypes=variables

        AddTwoIntegers obj = new AddTwoIntegers();
        int Num1 = obj.inputint();
        int Num2 = obj.inputint();
        int sum = Num1 + Num2;
        System.out.println("Total of Adding two integers : " + sum);

    }

    int inputint() {//method

        int i;//datatypes variable
        System.out.println("Enter integer value: ");
        Scanner myScannerObj = new Scanner(System.in);//Scanner
        do {//Validation
            while (!myScannerObj.hasNextInt()) {
                String input = myScannerObj.next();
                System.out.println("That's not a number!");
                myScannerObj.next();
            }
            i = myScannerObj.nextInt();
            myScannerObj.close();//Scanner Close

        } while (i < 0);
        return i;
    }
}

      /*  do {//Validation
            System.out.println("Please enter a positive number! ");
            while (!myScannerObj.hasNextInt()) {//string
                myScannerObj.next();
                System.out.println("That's not a number!");
            }
            i = myScannerObj.nextInt();

        } while (i <= 0);

        System.out.println("Enter j value: ");

        do {//Validation
            System.out.println("Please enter a positive number! ");
            while (!myScannerObj.hasNextInt()) {//string
                String input = myScannerObj.next();
                System.out.println("That's not a number!");
            }
            j = myScannerObj.nextInt();

        }
        while (j <= 0);
        int sum = i + j;
        System.out.println("Total of Adding two integers : " + sum);
        myScannerObj.close();//Scanner Close*/


//  ------------------------------------------------------------------------------------------












