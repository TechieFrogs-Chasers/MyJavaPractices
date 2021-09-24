package Assignment_1;
import java.util.Scanner;

public class Triangle {
    //int area;
    //int perimeter;
    int a=3,b=4,c=5;
    int area;
    int perimeter;
    public static void main(String[] args) {
        new Triangle();
    }
        Triangle()
        { 
            area = a*b*c;
            perimeter = a+b+c;
            System.out.println("area of triangle:" +area);
            System.out.println("perimeter of triangle:"+perimeter);
        }
    }
    
    
    
    

