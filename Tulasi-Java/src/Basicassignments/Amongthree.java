package Basicassignments;

import java.util.Scanner;

public class Amongthree {
    public static void main(String[] args) {//main method
        Scanner myscannerobj = new Scanner(System.in);//Scanner
        int a, b, c;
        //a Validation
        System.out.println("Enter the numbers a: ");
        do {
            while (!myscannerobj.hasNextInt()) {
                String input = myscannerobj.next();
                System.out.println("That's not a number!");
            }
            a = myscannerobj.nextInt();
            if (a <= 0)
                System.out.println("Please enter a positive number! ");
        }
        while (a <= 0);
      //b Validation
        System.out.println("Enter the numbers b: ");
        do {
            while (!myscannerobj.hasNextInt()) {
                String input = myscannerobj.next();
                System.out.println("That's not a number!");
            }
            b = myscannerobj.nextInt();
            if (b <= 0)
                System.out.println("Please enter a positive number! ");
        }
        while (b <= 0);
      //c Validation
        System.out.println("Enter the numbers c: ");
        do {
            while (!myscannerobj.hasNextInt()) {
                String input = myscannerobj.next();
                System.out.println("That's not a number!");
            }
            c = myscannerobj.nextInt();
            if (c <= 0)
                System.out.println("Please enter a positive number! ");
        }
        while (c <= 0);

        if ((a > c) && (a > b)) {
            System.out.println(a + " " + "is largest among the three numbers.");
        } else if (b > c) {
            System.out.println(b + " " + "is largest among the three numbers.");
        } else {
            System.out.println(c + " " + "is largest among the three numbers.");
        }
        System.out.println();
        myscannerobj.close();//Scanner Close
    }

}

