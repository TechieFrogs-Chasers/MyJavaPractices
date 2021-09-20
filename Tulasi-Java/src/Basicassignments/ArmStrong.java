package Basicassignments;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner myScannerObj=new Scanner(System.in);
        int num, temp, total = 0;
        int num1 = 0;

        do {//Validation
            System.out.println("Please enter a positive number! ");
            while (!myScannerObj.hasNextInt()) {
                String input = myScannerObj.next();
                System.out.println("That's not a number!");
            }
            num = myScannerObj.nextInt();

        } while (num <= 0);
        myScannerObj.close();//Scanner Close
        num = num1;
        for (; num != 0; num/=10) {
            temp = num % 10;
            total = total + temp*temp*temp;
        }
        if (total == num)
            System.out.println("Is an Armstrong number");
        else
            System.out.println("Is not an Armstrong number");
    }
}
