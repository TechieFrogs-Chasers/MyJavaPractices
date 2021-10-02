package ClassesObjects;//Package

import java.util.Scanner;

public class AreaRectangleConstructors {//class
   static int length;
   static int breadth;

    public static void main(String[] args) {//main method
        Scanner myScannerObj = new Scanner(System.in);//Scanner
        System.out.println("Enter length and breadth: ");
        int length = myScannerObj.nextInt();//input scanners for int length
        int breadth = myScannerObj.nextInt();//input scanners for int breadth
        AreaRectangleConstructors obj = new AreaRectangleConstructors(length, breadth);//Instance obj for class
        myScannerObj.close();//Scanner closed
    }
        AreaRectangleConstructors(int length,int breadth) {//constructor
            AreaRectangleConstructors.length = length;
            AreaRectangleConstructors.breadth = breadth;
            int area = returnArea(length, breadth);
            System.out.println("Area of rectangle is :" + area);

        }

        int returnArea( int l, int b){//return int method with area and rectangle
            return (l * b);//return

        }
    }

