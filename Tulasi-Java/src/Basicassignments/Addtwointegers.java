package Basicassignments;

import java.util.Scanner;

public class Addtwointegers {

    public static void main(String[] args) {//main method
        Scanner myScannerObj = new Scanner(System.in);//Scanner
        int i, j;//datatypes
        System.out.println("Enter i value: ");

        do {//Validation
            while (!myScannerObj.hasNextInt()) {
                myScannerObj.next();
                System.out.println("That's not a number!");
            }
            i =myScannerObj.nextInt();
            if (i <= 0)
                System.out.println("Please enter a positive number! ");
        } while (i <= 0);

        System.out.println("Enter j value: ");

        do {//Validation
            while (!myScannerObj.hasNextInt()) {
                String input = myScannerObj.next();
                System.out.println("That's not a number!");
            }
            j = myScannerObj.nextInt();
            if (j <= 0)
                System.out.println("Please enter a positive number! ");
        }
        while (j <= 0);
        int sum = i + j;
        System.out.println("Total of Adding two integers : " + sum);
        myScannerObj.close();//Scanner Close
    }
}


  /* ------------------------------------------------------------------------------------------
       Addtwointegers obj = new Addtwointegers();
        int Num1 = obj.inputint();
        int Num2 = obj.inputint();
        int sum = Num1 + Num2;
        System.out.println("Total of Adding two integers : " + sum);

    }
    int inputint() {//method

        int i;//datatypes
        System.out.println("Enter integer value: ");
        Scanner myscannerobj = new Scanner(System.in);//Scanner
        do  {//Validation
            while (!myscannerobj.hasNextInt()) {
                String input = myscannerobj.next();
                System.out.println("That's not a number!");
            }
            i = myscannerobj.nextInt();
            if(i<0)
                System.out.println("Please enter a positive number! ");
        } while (i < 0) ;
        myscannerobj.close();//Scanner Close
        return i;*/











