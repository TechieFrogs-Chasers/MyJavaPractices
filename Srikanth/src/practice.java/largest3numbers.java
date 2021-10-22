package practice;

import java.util.Scanner;

public class largest3numbers {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        int largest = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first no: ");
        a = s.nextInt();
        System.out.println("Enter second no: ");
        b = s.nextInt();
        System.out.println("Enter third no: ");
        c = s.nextInt();

        if (a > b && a > c) {
            largest = a;
        } else if (b > a && b > c)
            largest = b;
        else
            largest = c;
        System.out.println("Largest no is: " + largest);
        s.close();

    }
}
