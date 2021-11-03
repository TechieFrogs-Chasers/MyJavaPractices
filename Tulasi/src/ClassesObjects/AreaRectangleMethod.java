package ClassesObjects;

import java.util.Scanner;

public class AreaRectangleMethod {//class
    int l, b;

    public static void main(String[] args) {//main method
        Scanner myScannerObj = new Scanner(System.in);//Scanner
        AreaRectangleMethod obj = new AreaRectangleMethod();//Instance obj for class
        System.out.println("Enter length and breadth: ");
        int l = myScannerObj.nextInt();//input scanners for int area
        int b = myScannerObj.nextInt();//input scanners for int rectangle
        obj.setDim(l, b);//call setDim method
        myScannerObj.close();//Scanner closed

    }

    void setDim(int length, int breadth) {//setDim method with parameters length,breadth

        l = length;
        b = breadth;
        int areaA;
        areaA = getArea(l, b);
        System.out.println("Area of Rectangle is " + areaA);
    }

    int getArea(int l, int b) {//return int method with area and rectangle
        return (l * b);//return
    }
}
