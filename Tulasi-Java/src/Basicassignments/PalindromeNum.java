package Basicassignments;

import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {//main
        Scanner myScannerObj = new Scanner(System.in);//Scanner
        System.out.println("Enter a number : ");
        int num = myScannerObj.nextInt();
        int rev, sum = 0;
        int temp = num;

        do {
            System.out.println("Please enter a positive number! ");
            while (!myScannerObj.hasNextInt()) {
                String input = myScannerObj.next();
                System.out.println("That's not a number!");
            }

        }
        while (num <= 0);

        while (num > 0) {
            rev = num % 10;
            sum = (sum * 10) + rev;
            num = num / 10;
        }
        if (temp == sum)
            System.out.println("Its a Palindrome number !");
        else
            System.out.println("Its not a Palindrome number !");
        myScannerObj.close();//Scanner close
    }
}

