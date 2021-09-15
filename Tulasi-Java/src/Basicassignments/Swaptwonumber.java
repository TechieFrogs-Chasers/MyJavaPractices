package Basicassignments;

import java.util.Scanner;

public class Swaptwonumber {
    public static void main(String[] args) {
        float i, j, k;
        Scanner myScannerObj = new Scanner(System.in);//Scanner
        System.out.println("Enter i & j values : ");

        //i Validation

        do {
            while (!myScannerObj.hasNextFloat()) {
                String input = myScannerObj.next();
                System.out.println("That's not a number!");
            }
            i = myScannerObj.nextFloat();
        } while (i <= 0);

        //j Validation

        do {
            while (!myScannerObj.hasNextFloat()) {
                String input = myScannerObj.next();
                System.out.println("That's not a number!");
            }
            j = myScannerObj.nextFloat();
        } while (j <= 0);

        System.out.println("Before swapping the numbers: " + i + " " + j);
        k = i;
        i = j;
        j = k;
        System.out.println("After swapping: " + i + " " + j);
        myScannerObj.close();//Scanner Close
    }
}