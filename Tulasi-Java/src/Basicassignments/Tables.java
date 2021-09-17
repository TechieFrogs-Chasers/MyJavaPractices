package Basicassignments;

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        System.out.println("Enter the number for which table to dipaly :");
        Scanner myScannerObj = new Scanner(System.in);
        int table, total, count = 1;
        do {
            while (!myScannerObj.hasNextInt()) {
                String input = myScannerObj.next();
                System.out.println("That's not a number!");
            }
            table = myScannerObj.nextInt();

        } while (count <= 0);
        for (count = 1; count <= 10; count++) {
            total = table * count;
            System.out.println(count + " * " + table + " = " + total);
            myScannerObj.close();//scanner close
        }
    }
}