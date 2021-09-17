package Basicassignments;

import java.util.Scanner;

public class LeftPascalsTraingle {
    public static void main(String[] args) {
        Scanner myScannerObj = new Scanner(System.in);
        int row, spaces, stars;
        int num;
        do {
            System.out.println("Enter a positive number: ");
            while (!(myScannerObj.hasNextInt())) {
                String input = myScannerObj.next();
                System.out.println("Its not a number: ");

            }
            num = myScannerObj.nextInt();
        } while (num <= 0);

        for (row = 1; row <= num; row++) {
            for (spaces = 1; spaces < (num - row) + 1; spaces++) {
                System.out.print("   ");
            }
            for (stars = 1; stars <= (num - spaces) + 1; stars++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (row = 1; row <= num; row++) {
            for (spaces = 1; spaces <=(row - 1)+1; spaces++) {
                System.out.print("   ");
            }
            for (stars = 1; stars <= num - row; stars++) {
                System.out.print(" * ");
            }
            System.out.println();
            myScannerObj.close();
        }
    }
}

