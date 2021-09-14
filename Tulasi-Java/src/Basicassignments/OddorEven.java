package Basicassignments;

import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {
        Scanner myscannerobj = new Scanner(System.in);//Scanner
        int num;
        System.out.println(" Enter a number to check whether a number is Even or Odd :");

        do {//Validation
            while (!myscannerobj.hasNextInt()) {
                String input = myscannerobj.next();
                System.out.println("That's not a number!");
            }
            num = myscannerobj.nextInt();
            if (num <= 0)
                System.out.println("Please enter a positive number! ");
        } while (num <= 0);

        if (num % 2 == 0)
            System.out.println("It's an Even number ");
        else
            System.out.println("It's an Odd number ");
        myscannerobj.close();//Scanner Close
    }

}
