package Basicassignments;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {//main
        Scanner myScannerObj = new Scanner(System.in);//Scanner
        int prime;

        System.out.println("Enter any number to verify whether it a prime number or not:");
        do {
            System.out.println("Please enter a positive number! ");
            while (!myScannerObj.hasNextInt()) {//no string
                String input = myScannerObj.next();
                System.out.println("That's not a number!");
            }
            prime = myScannerObj.nextInt();
        }
        while (prime <= 0);

        for (int i = 2; i < prime / 2; i++) {
            if (prime % i == 0) {
                System.out.println("prime value");
                break;
            } else
                System.out.println("Not a prime number");
            myScannerObj.close();//Scanner close
        }
    }
}
