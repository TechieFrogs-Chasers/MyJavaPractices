package Basicassignments;

import java.util.Scanner;

public class AddTwoIntegers {

    public static void main(String[] args) {//main method
        Scanner myScannerObj = new Scanner(System.in);//Scanner
        int i, j;//datatypes=variables

        AddTwoIntegers obj = new AddTwoIntegers();
        int Num1 = obj.inputint(myScannerObj);
        int Num2 = obj.inputint(myScannerObj);
        int sum = Num1 + Num2;
        System.out.println("Total of Adding two integers : " + sum);
        myScannerObj.close();//scanner closed
    }

    int inputint(Scanner scanner) {//method

        int i;//datatypes variable
        System.out.println("Enter integer value: ");

        do {//Validation
            System.out.println("Enter a positive value: ");
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.println("That's not a number!");
                scanner.next();
            }
            i = scanner.nextInt();

        } while (i < 0);
        return i;
    }
}













