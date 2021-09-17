package Basicassignments;

import java.util.Scanner;

public class RightPascalsTraingle {
    public static void main(String[] args) {
        Scanner myScannerObj = new Scanner(System.in);
        int num;
        int rows, stars;

        do {
            System.out.println("Please entry a positive number: ");
            while (!(myScannerObj.hasNextInt())) {
                String input = myScannerObj.next();
                System.out.println("Its not a number ");
            }
            num = myScannerObj.nextInt();
        } while (num <= 0);

        for (rows = 1; rows <= num; rows++) {
            for (stars = 1; stars <= (rows + 1) - 1; stars++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (rows = 1; rows <= num; rows++) {
            for (stars = 1; stars <= (num - rows); stars++) {
                System.out.print(" * ");
            }
            System.out.println();
            myScannerObj.close();
        }

    }
}