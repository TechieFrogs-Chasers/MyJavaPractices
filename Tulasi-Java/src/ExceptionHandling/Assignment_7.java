package ExceptionHandling;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment_7 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Enter integer : ");

        try {
            int i =scannerObj.nextInt();
            i = i / 0;
            System.out.println("In First try block");
        } catch (ArithmeticException ae) {
            System.out.println("In First Catch Block");
            System.out.println("Arithmetic Exception Handled :\n" + ae);

            try {
                throw new IOException();
            } catch (IOException ioe) {
                System.out.println("In Second Catch Block");
                System.out.println("IOException Handled :\n" + ioe);
                try {
                    throw new NumberFormatException();
                } catch (NumberFormatException nfe) {
                    System.out.println("In Third Catch Block");
                    System.out.println("NumberFormatException Handled  :\n" + nfe);
                }

            }

        }

    }
}

