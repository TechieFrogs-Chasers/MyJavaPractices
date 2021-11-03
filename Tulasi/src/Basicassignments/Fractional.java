package Basicassignments;

import java.util.Scanner;

public class Fractional {
    public static void main(String[] args) {
        System.out.println("Factorial of :");
        Scanner myScannerObj = new Scanner(System.in);//Scanner
        int num, i = 1;
        long factorial = 1;

        do {//Validation
            System.out.println("Please enter a positive number! ");
            while (!myScannerObj.hasNextInt()) {
                String input = myScannerObj.next();
                System.out.println("That's not a number!");
            }
            num = myScannerObj.nextInt();

        } while (i <= 0);
        {
            for (i = 1; i <= num; i++) {
                while (i <= num) {
                    factorial = factorial * i;
                    i++;
                }
            }
            System.out.println("Factional of :" + factorial);
            myScannerObj.close();//scanner close
        }
    }
}