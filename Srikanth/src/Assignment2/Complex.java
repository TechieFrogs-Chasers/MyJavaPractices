package Assignment2;

import java.util.*;

public class Complex {

    double real;
    double imaginary;

    public static void main(String[] args) {
        Scanner cScanner = new Scanner(System.in);
        Complex objComplex = new Complex();

        cScanner.close();
    }

    void complex(Scanner cScanner) {
        System.out.println("Enter values for no1: ");
        real = cScanner.nextDouble();
        System.out.println("Enter values for no2: ");
        imaginary = cScanner.nextDouble();
    }

    double sum() {
        return real + imaginary;
    }

    double difference() {
        return real - imaginary;
    }

    double product() {
        return real * imaginary;
    }
}
