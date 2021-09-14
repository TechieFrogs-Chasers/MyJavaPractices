package Basicassignments;

import java.util.Scanner;

public class Fractional {
    public static void main(String[] args) {
        System.out.println("Factorial of :");
        Scanner myscannerobj = new Scanner(System.in);//Scanner
        int num, i = 1;
        long factorial = 1;

        do {//Validation
            while (!myscannerobj.hasNextInt()) {
                String input = myscannerobj.next();
                System.out.println("That's not a number!");
            }
            num = myscannerobj.nextInt();
            if (i <= 0)
                System.out.println("Please enter a positive number! ");
        } while (i <= 0);
        {
            for (i = 1; i <= num; i++) {
                while (i <= num) {
                    factorial = factorial * i;
                    i++;

                }
            }
            System.out.println("Factional of :" + factorial);
            myscannerobj.close();//scanner close
        }
    }
}