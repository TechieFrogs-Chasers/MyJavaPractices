package Assignment2;

import java.util.Scanner;

public class Complex {
    int x;
    int y;
    public static void main(String[] args) {
   /*    Complex complexObj = new Complex(); 
       int SumResult = complexObj.Sum(2, 2);
       System.out.println("Sum of Two Integers"+" "+SumResult);
       complexObj.Difference(10, 5);
       int Mul = Complex.Multiplication();
       System.out.println("Multiplication of Two Numbers"+" "+Mul);
       
    }

int Sum(int x, int y)
{
    int z = x+y;
    return z;
}

void Difference(int a, int b)
{
    int c = a-b;
    System.out.println("Difference Between a and b"+"is  "+c);
}

static int Multiplication()
        {
            int a = 5;
            int b = 8;
            int c = a*b;
            return c;*/

            Scanner scannerObj = new Scanner(System.in);
            int a = scannerObj.nextInt();
            int b = scannerObj.nextInt();
            scannerObj.close();
            Complex complexObj = new Complex(a,b);
            System.out.println("Constructor Values"+" "+" x = "+complexObj.x+" "+" y ="+complexObj.y);
            int SumResult = complexObj.Sum();
            System.out.println("Sum of Two Numbers"+" "+SumResult);
            int SubResult = Complex.Subtraction(a, b);
            System.out.println("Difference Between two Numbers"+" "+SubResult);
            complexObj.mul(a, b);
            

        }

        Complex(int x, int y)
        {
            this.x = x;
            this.y = y;
            
        }
        

        int Sum()
        {
            int Sum = x+y;
            return Sum;
        }
        static int Subtraction(int c, int d)
        {
            int e = c-d;
            return e;
        }
        void mul(int l, int m)
        {
            int n = l*m;
            System.out.println("Multiplication of Two Numbers"+" "+n);
        }
        

}
