package OOPS;

import java.util.Scanner;

public class Area {
int length;
int breadth;
    
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);// instance for scanner to pass the values
        Area areaObj = new Area();// instance of our classs use to call the menthods
            System.out.println("Enter value for Length");
            int length = scObj.nextInt();
                System.out.println("Enter value for breadth");
                int breadth = scObj.nextInt();
                scObj.close();
                areaObj.setDim(length, breadth);
    }
    void setDim(int length, int breadth){
        length = length;
        breadth= breadth;
        int area = getArea(length, breadth);
            System.err.println("Area of Rectangle : "+area);
    }
    int getArea(int length, int breadth){
        return length*breadth;
    }
    
}
