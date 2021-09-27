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
    Area(int length,int breadth){
      area= length *breadth;
      System.out.println("area of rectangle is :"+area);
    }
    public static void main(String...args){
        Scanner obj=new Scanner(System.in);
            Area object =new Area(5,4);
            Area object2=new Area(6,8);
            Area object3=new Area(9,5);
        object.SetDim(5,8);     //we call the method setDim
        System.out.println("enter the length");
           int l=obj.nextInt();
        System.out.println("enter the breadth");
           int b=obj.nextInt();
        object2.getArea(l,b); //we call the second method of return type
        object3.returnArea(l,b);

      /*  System.out.println("enter the length");
            int n=obj.nextInt();
        System.out.println("enter the breadth");
            int m=obj.nextInt();
         object3.returnArea(n,m); */  // call the another method 
         
         
      obj.close();
    }
    public int getArea(int l ,int b){  //with return type
        int area;
        area=l*b;
        System.out.println("area of rectangle is:"+area);
        return area;

    } 
    public int returnArea(int l, int b){
        int area;
        area =l*b;
        System.out.println("area of rectangle for returnarea: "+ area);
        return area;
    }
}
