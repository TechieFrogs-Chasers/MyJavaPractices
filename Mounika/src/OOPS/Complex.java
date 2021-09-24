package OOPS;

import java.util.Scanner;

public class Complex {
    int real;
    int imaginary;
    public static void main(String[] args) {
    
        Scanner scObj = new Scanner(System.in);
        System.out.println("enter value for real");
        int real = scObj.nextInt();
        System.out.println("enter value for imaginary");
        int imaginary = scObj.nextInt();
        Complex obj = new Complex(real, imaginary);
        System.out.println("Sum : "+obj.sum()+ " Diff :"+ obj.diff()+" Product : "+obj.product());
        
    }
    Complex(int r, int i){
        real = r;
        imaginary = i;
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
