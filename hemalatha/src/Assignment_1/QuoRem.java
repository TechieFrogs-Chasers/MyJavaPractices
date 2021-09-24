package Assignment_1;

import java.util.Scanner;
public class QuoRem {
    public static void main(String[] args)
    {
        //int a=3,b=9,rem,quo;
       // System.out.println("enter the number");
       // rem = a/b;
       // quo = a%b;
        //System.out.println("values  "  +rem+ " " +quo);
        //using scanner
        Scanner in = new Scanner(System.in);//for input
        System.out.println("enter the value to x:  ");
        int num1 = in.nextInt();
        System.out.println("enter the value to y:  ");
        int num2 = in.nextInt();
        int i = num1/num2;//to find quotient
        int j = num1%num2;// to find remainder
        System.out.println("enter Quotient is : " +i);
        System.out.println("enter remainder is : " +j);
        in.close();





    }
}
