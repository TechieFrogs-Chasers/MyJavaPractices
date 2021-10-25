package method;

import java.util.Scanner;
public class RectArea { 
    Scanner sc = new Scanner(System.in);
    int l = sc.nextInt();
    int b =sc.nextInt();
        public static void main(String[] args) {
        System.out.println("Enter the length & breadth of the rectangle:");  
        RectArea obj = new RectArea();
        obj.setDim(obj.l, obj.b); 
        int aa = obj.getArea();
        System.out.println(" the area is:" + aa);
    }
void setDim(int l, int b){
    
        System.out.println("the length & breadth: " + l + " & " + b);        
}
public int getArea(){
    int area = l * b;
    return area;
}
}





