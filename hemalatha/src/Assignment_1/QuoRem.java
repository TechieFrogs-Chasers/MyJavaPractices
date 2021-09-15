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
        int x = in.nextInt();
        System.out.println("enter the value to y:  ");
        int y = in.nextInt();
        int i = x/y;//to find quotient
        int j = x%y;// to find remainder
        System.out.println("enter Quotient is : " +i);
        System.out.println("enter remainder is : " +j);
        in.close();





    }
}
