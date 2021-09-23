package OopsConcepts;

import java.util.Scanner;

class Rectangle{
  int l,w,l1,w1;

  public int area1(){
  w=4;
  l=5;
 int a1=(l*w);
 //return a1;
 System.out.println("area of first triangle is " +a1);
 return a1;

  }

 int area(){
    w1=5;
    l1=8;
    int a2=(l1*w1);
   return a2;
}

Rectangle(int le,int br){
l=le;
w=br;
System.out.println("length is  "+le+" "+ "breadth is  "+br);
}
public static void main(String[] args) {
    
Rectangle rObj =new Rectangle(5,8);
rObj.area1();

Rectangle rObj1 =new Rectangle(4,5);
System.out.println("area of second triangle is " +rObj1.area());
}
}


 public class Area{ 


   int length,breadth,sum;

   int  setDim(){
    length=0;
    breadth=0;
     sum=length+breadth;
    return sum;
 }
    
   int getArea(){

   int area= 2*sum;
   //System.out.println( "area o the rectangle is  "+area);
     return area;
}

     Area(int l,int br){
        length=l;
        breadth= br;
    // int sum =2*(l+br);
    // System.out.println(sum);
     }
    int  returnArea(){
      int length=1;
      int breadth=1;
     int area=(2*length )+( 2*breadth);
     return area;
    }


public static void main(String[] args) {
   
  Scanner obj =new Scanner(System.in);
 System.out.println("Enter the value for length");
 obj.nextInt();
 System.out.println("enter the value for breadth");
  obj.nextInt();

   Area obj2 = new Area(1,1);
   obj2.returnArea();
   System.out.println(obj2.getArea());

 /*Area obj1 =new  Area();
  obj1.getArea();
 System.out.println(obj1.getArea());*/
 
 obj.close();
}





}












    

