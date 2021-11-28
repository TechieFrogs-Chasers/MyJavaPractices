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

        try
        {
            int i, sum1;
            sum = 10;
            for (i = -1; i < 3 ;++i)
                sum = (sum / i);
        }
        catch(ArithmeticException e)
        {
            System.out.print("0");
        }
        //System.out.print(sum1);-Value of variable sum is printed outside of try block, sum is declared only in try block, outside try block it is undefined.
    }
}
