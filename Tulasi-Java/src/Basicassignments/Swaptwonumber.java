package Basicassignments;

import java.util.Scanner;

public class Swaptwonumber {
    public static void main(String[] args) {
        float i, j, k;
        Scanner myscannerobj = new Scanner(System.in);//Scanner
        System.out.println("Enter i & j values : ");

        //i Validation

        do {
            while (!myscannerobj.hasNextFloat()) {
                String input = myscannerobj.next();
                System.out.println("That's not a number!");
            }
            i = myscannerobj.nextFloat();
        } while (i <= 0);

        //j Validation

        do {
            while (!myscannerobj.hasNextFloat()) {
                String input = myscannerobj.next();
                System.out.println("That's not a number!");
            }
            j = myscannerobj.nextFloat();
        } while (j <= 0);

        System.out.println("Before swapping the numbers: " + i + " " + j);
        k = i;
        i = j;
        j = k;
        System.out.println("After swapping: " + i + " " + j);
        myscannerobj.close();//Scanner Close
    }
}