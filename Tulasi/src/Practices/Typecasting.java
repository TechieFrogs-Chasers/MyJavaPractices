package Practices;

import Inheritance.A;
import java.io.IOException;
import java.util.Scanner;

class AppleBrand {
    static void apple(int cost, int unitPrice) {
        Scanner scannerObj = new Scanner(System.in);

        if (unitPrice == 0) {
            ArithmeticException ae = new ArithmeticException("Zero is not valid unitprice");
            ae = (ArithmeticException) ae.initCause(new IOException("Check the input given"));
            throw ae;

        } else {
            System.out.println(cost + unitPrice);
        }
        scannerObj.close();
    }

    void methodChild() {
        System.out.println("Child method");
    }
}

class SamsungBrand {
    static void sumsaung(int cost, int unitPrice) {
        if (unitPrice == 0) {
            ArithmeticException ae = new ArithmeticException("Zero is not a valid unitprice ");
            ae = (ArithmeticException) ae.initCause(new NullPointerException("Check the numbers input"));
            throw ae;
        } else {
            System.out.println(cost + unitPrice);
        }
    }

    void methodchild() {
        System.out.println("Second child method");
    }
}

public class Typecasting extends AppleBrand {
    public static void main(String[] args) throws ArithmeticException, IllegalArgumentException, IOException {

        int i = 100;
        char ch = 'A';
        i = ch;
        byte t = 88;
        double a = 0;
        int j = (int) 5.5;
        long r = (ch + i) + t;
        System.out.println(j);
        System.out.println(r);

        AppleBrand appleObj = new AppleBrand();
        appleObj.methodChild();

        SamsungBrand sumsungObj = new SamsungBrand();
        sumsungObj.methodchild();

        Typecasting typeObj = (Typecasting) appleObj;
        if (typeObj instanceof AppleBrand)
            ((AppleBrand) typeObj).methodChild();
        try {
            float k = (long) ((i + j) / a) - ch;
            System.out.println(k);
        } catch (ArithmeticException | IllegalArgumentException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Final statement");
        }
    }
}
