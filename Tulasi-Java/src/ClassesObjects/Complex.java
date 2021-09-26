package ClassesObjects;

import java.util.Scanner;

public class Complex {//class
    double real, imaginary;

     void com(Scanner myScannerObj) {//method
        System.out.println("Enter values for num and num1 for complex number ");
        real = myScannerObj.nextDouble();
        imaginary = myScannerObj.nextDouble();
    }

    public static void main(String[] args) {//main
        Scanner myScannerObj = new Scanner(System.in);//Scanner
        Complex c1 = new Complex();
        c1.com(myScannerObj);
        Complex c2 = new Complex();
        c2.com(myScannerObj);
        Complex temp = sum(c1, c2);
        System.out.println("Sum is: " + temp.real + " + " + temp.imaginary + "i");
        Complex temp1 = difference(c1, c2);
        System.out.println("Difference  is: " + temp1.real + " + " + temp1.imaginary + "i");
        Complex temp2 = product(c1, c2);
        System.out.println("Product is: " + temp2.real + " + " + temp2.imaginary + "i");
        myScannerObj.close();//Scanner closed
    }

    public static Complex sum(Complex num1, Complex num2) {//method
        Complex temp = new Complex();
        temp.real = num1.real + num2.real;
        temp.imaginary = num1.imaginary + num2.imaginary;
        return temp;
    }

    public static Complex difference(Complex num1, Complex num2) {//method
        Complex temp = new Complex();
        temp.real = num1.real - num2.real;
        temp.imaginary = num1.imaginary - num2.imaginary;
        return temp;
    }

    public static Complex product(Complex num1, Complex num2) {//method
        Complex temp = new Complex();
        temp.real = num1.real * num2.real;
        temp.imaginary = num1.imaginary * num2.imaginary;
        return temp;
    }

}






