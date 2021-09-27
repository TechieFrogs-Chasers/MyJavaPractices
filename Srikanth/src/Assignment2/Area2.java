package Assignment2;

import java.util.*;

public class Area2 {
    static int lenght;
    static int breadth;

    public static void main(String[] args) {
        Scanner aScanner = new Scanner(System.in);
        System.out.println("Enter the length:");
        int l = aScanner.nextInt();
        System.out.println("Enter the breadth:");
        int b = aScanner.nextInt();
        new Area2(l, b);
        aScanner.close();
    }

    Area2(int length, int breadth) {
        Area2.lenght = length;
        Area2.breadth = breadth;
        int area = returnArea(length, breadth);
        System.out.println("Area of the rectangle :" + area);
    }

    int returnArea(int l, int b) {
        return (l * b);
    }
}
