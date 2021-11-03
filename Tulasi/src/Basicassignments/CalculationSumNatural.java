package Basicassignments;

import java.util.Scanner;

public class CalculationSumNatural {
    public static void main(String[] args) {
        Scanner myScannerObj = new Scanner(System.in);//Scanner
        int i = 1;
        int naturalnum = 0, num;

        System.out.println("Sum of natural number :");
        do {//Validation
            while (!myScannerObj.hasNextInt()) {//for not to allow characters
                String input = myScannerObj.next();
                System.out.println("That's not a number!");
            }

        } while (i <= 0);

        num = myScannerObj.nextInt();
        for (i = 1; i <= num; ++i) {

            naturalnum = naturalnum + i;

        }
        System.out.println("Sum of" + " " + num + " " + "natural number" + " = " + naturalnum);
        myScannerObj.close();//scanner close

    }
}