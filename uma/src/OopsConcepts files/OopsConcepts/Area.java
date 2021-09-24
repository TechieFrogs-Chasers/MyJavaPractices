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

   void  setDim(int l,int br){
    length=l;
    breadth=br; 
 }
    
   int getArea(){

   int area= length*breadth;

   System.out.println( "area of the rectangle is  "+area);
     return area;
}

     Area(int l,int br){
        length=l;
        breadth= br;
    
     }
    int  returnArea(){
      int length=1;
      int breadth=1;
      int area=length*breadth;
     return area;
    }


public static void main(String[] args) {
   
  Scanner obj =new Scanner(System.in);
 System.out.println("Enter the value for length");
  int length=obj.nextInt();
 System.out.println("enter the value for breadth");
  int breadth=obj.nextInt();

   Area obj2 = new Area(length,breadth);
   obj2.returnArea();
   System.out.println(obj2.getArea());

 
 obj.close();
}





}












    

