package Assignment2;

import java.util.*;

public class Complex {

    double real;
    double imaginary;

    public static void main(String[] args) {
        Scanner cScanner = new Scanner(System.in);
        Complex c1 = new Complex();
        Complex c2 = new Complex();

        c1.getData(cScanner);
        c2.getData(cScanner);

        Complex temporary = sum(c1, c2);
        System.out.println("Sum is: " + temporary.real + " + " + temporary.imaginary + "i");

        Complex temporary2 = difference(c1, c2);
        System.out.println("Difference is: " + temporary2.real + "+" + temporary2.imaginary + "i");

        Complex temporary3 = product(c1, c2);
        System.out.println("Product is: " + temporary3.real + "+" + temporary3.imaginary + "i");
        cScanner.close();
    }

    public void getData(Scanner cScanner) {
        System.out.println("Enter values for no1 for real: ");
        real = cScanner.nextDouble();
        System.out.println("Enter values for no2 for imaginary: ");
        imaginary = cScanner.nextDouble();
    }

    public static Complex sum(Complex num1, Complex num2) {
        Complex tComplex = new Complex();
        tComplex.real = num1.real + num2.real;
        tComplex.imaginary = num1.imaginary + num2.imaginary;
        return tComplex;
    }

    public static Complex difference(Complex num1, Complex num2) {
        Complex tComplex = new Complex();
        tComplex.real = num1.real - num2.real;
        tComplex.imaginary = num1.imaginary - num2.imaginary;
        return tComplex;
    }

    public static Complex product(Complex num1, Complex num2) {
        Complex tComplex = new Complex();
        tComplex.real = num1.real * num2.real;
        tComplex.imaginary = num1.imaginary * num2.imaginary;
        return tComplex;
    }
}
