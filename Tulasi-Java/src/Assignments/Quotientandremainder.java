package Basicassignments;

import java.util.Scanner;

public class Quotientandremainder {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int divide=sc.nextInt();
        int divider=sc.nextInt();
        System.out.println("Quotient = " + divide/divider);
        System.out.println("Remainder = " + divide%divider);
        sc.close();
    }
}
