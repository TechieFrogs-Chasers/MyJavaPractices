package method;

import java.lang.*;
import java.util.Scanner;
public class Perimeter {

    public static void main(String[] args) {
        Triangle obj = new Triangle();
        
        
    }
}
class Triangle{
    int a = 3, b=4, c=5;
public Triangle(){
    
    int area = ((b*a)/2);
    int perimeter=a+b+c;
    System.out.println("The area of the triangle is: " + area);
    System.out.println("The Perimeter of the triangle: "+  perimeter);

}
    
}
