package sindhu.src.OOPs.Assignment;

import java.util.Scanner;

public class Complex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter real number");
        int x = input.nextInt();

        System.out.println("enter imaginary number");
        int y = input.nextInt();

        //int yi;
        int sum = x+y;
        int diff = x-y;
        int pro = x*y;
        System.out.println("sum of two numbers"+sum);
        System.out.println("sum of two numbers"+diff);
        System.out.println("sum of two numbers"+pro);
        input.close();


    }

    public int real;
    public int imag;
    
}
