package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment_6 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter two number : ");

        int sum, sub, multiply;

        try {
            int num = scannerObj.nextInt();
            int num1 = scannerObj.nextInt();
            sum = num + num1;
            System.out.println("Sum of two number: " + sum);
            try {//nested try block
                sub = num - num1;
                System.out.println("Sub of two numbers: " + sub);
                try {//nested try block
                    multiply = num * num1;
                    System.out.println("Mul of two numbers: " + multiply);
                }
                catch (StringIndexOutOfBoundsException se) {
                    System.out.println(se);
                }
            }
            catch (InputMismatchException ie) {
                System.out.println(ie);

            }
            catch (Exception ee) {
                System.out.println(ee);
            }
        }
        finally {
            System.out.println("Final statement");
        }
    }
}