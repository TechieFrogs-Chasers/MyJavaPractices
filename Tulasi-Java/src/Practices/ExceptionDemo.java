package Practices;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
      /*  try(Scanner scannerObj=new Scanner(System.in)){
            int age=scannerObj.nextInt();
            System.out.println(age);

        }//with out catch and finally blocks*/
        int sum, multiply, sub, division;
        String nameSum;
        Scanner scannerObj = new Scanner(System.in);
        int num = scannerObj.nextInt();
        int num2 = scannerObj.nextInt();
        String name = scannerObj.next();
        String name1 = scannerObj.next();

        try {
            sum = num + num2;
            System.out.println("Sum of two numbers: " + sum);
            try {
                multiply = num * num2;
                System.out.println("Multiplication of two numbers: " + multiply);
            } catch (IndexOutOfBoundsException iobe) {
                System.out.println(iobe);
            }
        } catch (InputMismatchException ie) {
            System.out.println("InputMismatch: " + ie);
        } catch (NullPointerException ne) {
            System.out.println("NullPointer: " + ne);
        }
        try {
            nameSum = name + " " + name1;
            System.out.println("Strings :" + nameSum);
        } finally {
            System.out.println("FInal statement");
        }


    }
}
