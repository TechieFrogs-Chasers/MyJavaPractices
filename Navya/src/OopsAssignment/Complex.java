package OopsAssignment;

import java.util.Scanner;

public class Complex {
    int real;
    int imaginary;
    public static void main(String[] args) {
        Complex obj1 = new Complex();
        obj1.sum();
        obj1.diff();
        obj1.product();
        Scanner myScannerObj = new Scanner(System.in);
        System.out.println("enter value for real" );
        int real = myScannerObj.nextInt();
        
        System.out.println("enter value for imaginary");
        int imaginary = myScannerObj.nextInt();
        System.out.println("complex number is " +real+" + "+imaginary+"i");
        Complex obj = new Complex(real, imaginary);
        System.out.println("Sum : "+obj.sum()+ " Diff :"+ obj.diff()+" Product : "+obj.product());
       
        myScannerObj.close();
    }
    Complex(int r, int i){
        real = r;
        imaginary = i;
    }
      Complex() {
          System.out.println("it is a default consturctor");
    }
    int sum(){
         return real+imaginary;
    }
    int diff(){
        return real - imaginary;
    }
    int product(){
        return real*imaginary;

    }
}
