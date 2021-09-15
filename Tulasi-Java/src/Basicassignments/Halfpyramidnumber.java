package Basicassignments;

import java.util.Scanner;

public class Halfpyramidnumber {
    public static void main(String[] args) {
        Scanner myScannerObj = new Scanner(System.in);//Scanner
        int i, j;
         int lines;
        System.out.println("  --Create Half Pyramid with numbers-- ");
        System.out.println();

        System.out.println("Enter a number, how many lines you want : ");
        do {//validation
            while (!myScannerObj.hasNextInt()) {
                String input = myScannerObj.next();
                System.out.println("That's not a number!");
            }
            lines = myScannerObj.nextInt();
            if (lines <= 0)
                System.out.println("Please enter a positive number! ");
        } while (lines <= 0);

        System.out.println(" Pyramid details : ");

        for (i = 1; i <= lines; i++) {
            for (j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }


    }
}