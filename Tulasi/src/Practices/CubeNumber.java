package Practices;

import java.util.Scanner;

public class CubeNumber {
    public static void main(String[] args) {
        int a=1,b;
        System.out.println(" Input number of terms :");
        Scanner sc = new Scanner(System.in);
         b=sc.nextInt();
         for (a=1;a<=b;a++)
        {
            System.out.println("Number is :" + a + " and cube of " + a +" "+ "is : " + (a * a * a));
        }

    }
}