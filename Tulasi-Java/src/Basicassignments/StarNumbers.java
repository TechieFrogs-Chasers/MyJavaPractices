package Basicassignments;

import java.util.Scanner;

public class StarNumbers {
    public static void main(String[] args) {
        Scanner myScannerObj = new Scanner(System.in);
        int i, j, k, l;//i=lines,j=space,stars
        int lines, temp = 1;
        System.out.println("  --Create Half Pyramid with numbers-- ");
        System.out.println();

        do {
            System.out.println("Please enter a positive number! ");
            while (!(myScannerObj.hasNextInt())) {
                String input = myScannerObj.next();
                System.out.println("Its not a number ");
            }
            lines = myScannerObj.nextInt();

        } while (lines <= 0);

        for (i = 1; i <= lines; i++) {
            for (j = 1; j <= (lines - i); j++) {
                System.out.print(" ");
            }
            for (k = i; k <= (i * 2 - 1); k++) {
                System.out.print(k);
            }
            for (l = (k - 2); l >= i; l--) {
                System.out.print(l);
            }
            System.out.println();
            myScannerObj.close();//scanner close
        }
    }
}
