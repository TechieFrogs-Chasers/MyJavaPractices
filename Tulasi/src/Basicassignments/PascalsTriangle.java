package Basicassignments;

import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner myScannerObj = new Scanner(System.in);
        int line, rows, spaces, num, i = 1;

        do {//Validation
            System.out.println("Please entry a positive number: ");
            while (!(myScannerObj.hasNextInt())) {
                String input = myScannerObj.next();
                System.out.println("That is not a number: ");
            }
            line = myScannerObj.nextInt();
        } while (line <= 0);

        for (rows = 0; rows < line; rows++) {//rows
            for (spaces = line; spaces > rows; spaces--) { //space
                System.out.print(" ");
            }
            i = 1;
            for (num = 0; num <= i; num++) {//numbers
                System.out.print(i + " ");
                i = i * (i - num) / (num + 1);

            }
            System.out.println();
            myScannerObj.close();//scanner close
        }

    }
}
