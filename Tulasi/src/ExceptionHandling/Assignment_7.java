package ExceptionHandling;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment_7 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter integer : ");
        int num = scannerObj.nextInt();
        scannerObj.nextLine();
        System.out.println("Enter second integer : ");
        int num1 = scannerObj.nextInt();
        scannerObj.nextLine();

        try {
            int num2=scannerObj.nextInt();
            int num3 = scannerObj.nextInt();
            test(num2, num3);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }

    }
    static void test(int num2, int num3) throws Exception {
        try {
            if (num3 == 0) {
                throw new ArithmeticException("Cause");
            } else {
                System.out.println(num2 / num3);
            }
        } catch (ArithmeticException e) {
            try {
                throw new IOException("Actual cause", e);
            } catch (IOException ex) {
                throw new Exception("Another cause,ex");
            }
        }
    }
}



