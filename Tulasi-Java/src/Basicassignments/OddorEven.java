package Basicassignments;

import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {
        Scanner myScannerObj = new Scanner(System.in);//Scanner
        int num;
        System.out.println(" Enter a number to check whether a number is Even or Odd :");

        do {//Validation
            System.out.println("Please enter a positive number! ");
            while (!myScannerObj.hasNextInt()) {
                String input = myScannerObj.next();
                System.out.println("That's not a number!");
            }
            num = myScannerObj.nextInt();

        } while (num <= 0);

        if (num % 2 == 0)
            System.out.println("It's an Even number ");
        else
            System.out.println("It's an Odd number ");
        myScannerObj.close();//Scanner Close
    }

}
