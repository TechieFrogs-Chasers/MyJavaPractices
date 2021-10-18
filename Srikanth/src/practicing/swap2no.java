package practice;

import java.util.Scanner;

public class swap2no {
    public static void main(String[] args) {
        int a, b;
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter a value1: ");
        a = sn.nextInt();
        System.out.println("Enter a value2: ");
        b = sn.nextInt();
        System.out.println("Before swapping: a= " + a + "and b= " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping : a= " + a + "and b= " + b);

        sn.close();
    }
}
