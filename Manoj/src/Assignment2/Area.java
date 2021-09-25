package Assignment2;
import java.util.Scanner;

public class Area {
    int area,length,breadth; 

    void SetDim(int i,int j){  //without return type
        length=i;
        breadth=j;
        area=length*breadth;
        System.out.println("area of rectangle : "+ area);
        

    }
    public static void main(String...args){
        Scanner obj=new Scanner(System.in);
        Area object=new Area();
        Area object2=new Area();//
        object.SetDim(5,6);     //we call the method setDim
        System.out.println("enter the length");
        int l=obj.nextInt();
        System.out.println("enter the breadth");
        int b=obj.nextInt();
        object2.getArea(l,b); //we call the second method of return type

      obj.close();
    }
    
    public int getArea(int l ,int b){  //
        int area;
        area=l*b;
        System.out.println("area of rectangle is:"+area);
        return area;

    } 
}
