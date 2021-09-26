package Assignment2;

import java.util.*;

public class Area {
    public static void main(String[] args) {
        Scanner aScanner = new Scanner(System.in);
        Area obArea = new Area();
        System.out.println("Enter the length: ");
        int l = aScanner.nextInt();
        System.out.println("Enter the breadth:");
        int b = aScanner.nextInt();
        obArea.setDim(l, b);
        aScanner.close();

    }

    void setDim(int length, int breadth) {
        int l = length;
        int b = breadth;
        int areaA = getArea(l, b);
        System.out.println("Area of rectangle is " + areaA);
    }

    int getArea(int l, int b) {
        return (l * b);
    }
}
