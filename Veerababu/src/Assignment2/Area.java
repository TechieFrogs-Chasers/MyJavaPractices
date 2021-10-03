package Assignment2;

import java.util.Scanner;

public class Area {
    int x =10;
    int y =15;
    public static void main(String[] args) 
    {
       
        Area area = new Area();
        area.setDim();
        int Result = Area.getArea(5, 6); 
        System.out.println("Area of Rectangle"+" "+Result);

    }
    public void setDim()
    {
        Scanner scannerObj = new Scanner(System.in);
        int x = scannerObj.nextInt();
        int y = scannerObj.nextInt();
        scannerObj.close();
        System.out.println("Length "+" "+x+" "+"Breadth "+" "+y);
        
    }
    public static int getArea(int x, int y)
    {
        int z = x*y;
        System.out.println("In my Method"+" "+z);
        return z;
        
    }

}
