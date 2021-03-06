package Basicassignments;

import java.util.Scanner;

public class HalfPyramidStar {
    public static void main(String[] args) {
        Scanner myScannerObj = new Scanner(System.in);//Scanner
        int i, j;
        int stars = 0, lines;
        System.out.println("  --Create Half Pyramid with special character-- ");
        System.out.println();

        System.out.println("Enter a number, how many lines you want : ");
        do {//validation
            System.out.println("Please enter a positive number! ");
            while (!myScannerObj.hasNextInt()) {//for not to allow characters
                String input = myScannerObj.next();
                System.out.println("That's not a number!");
            }
            lines = myScannerObj.nextInt();

        } while (lines <= 0);

        System.out.println("Pyramid details : ");

        for (i = lines - 1; i >= 0; i--) {//lines loop
            for (j = 0; j <= i; j++) {//star loop//nested for loop
                System.out.print(" * ");
            }
            System.out.println();
            myScannerObj.close();//scanner close
        }
    }
}
