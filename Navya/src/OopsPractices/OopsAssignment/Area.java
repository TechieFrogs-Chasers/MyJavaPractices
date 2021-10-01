package OopsPractices.OopsAssignment;

import java.util.Scanner;

public class Area {
    int length;
    int breadth;
    int l, w;
    public int setDim(int a, int b){
    length = a;
    breadth = b;
    int areaOfRectangle = (a*b);
   System.out.println("area of first triangle is " +areaOfRectangle);
   return areaOfRectangle;
  
    }
  
   int getArea(int c , int d){
       length = c;
       breadth = d;
      int areaOfRectangle1=(c*d);
      System.out.println("area of second triangle is "+areaOfRectangle1);
     return areaOfRectangle1;
  }
  int returnArea(int s, int n){
      length = s;
      breadth = n;
      int area = (s*n);
      System.out.println("area of third triangle is "+area);
      return area;
  }
  
  Area(int length,int breath){
  l=length;
  w=breath;
  System.out.println("length is  "+length+" "+ "breadth is  "+breath);
  }
  public static void main(String[] args) {
      Scanner myScannerObj = new Scanner(System.in);
      int a,b,c,d,s,n;
      a = Area.validatePositiveNumber(myScannerObj);
     // a = myScannerObj.nextInt();
      System.out.println("Enter the length of rectangle = "+ a);
      b = Area.validatePositiveNumber(myScannerObj);
      System.out.println("Enter the breath of rectangle = "+b);
     Area myObj =new Area(a,b);
     myObj.setDim(a, b);
     c = Area.validatePositiveNumber(myScannerObj);
     System.out.println("Enter the length of rectangle = "+ c);
     d = Area.validatePositiveNumber(myScannerObj);
     System.out.println("Enter the breath of rectangle = "+ d);
     Area myObj1 =new Area(c,d);
     myObj1.getArea(c, d);
     s = Area.validatePositiveNumber(myScannerObj);
     System.out.println("Enter the length of rectangle = "+ s); 
     n = Area.validatePositiveNumber(myScannerObj);
     System.out.println("Enter the breath of rectangle = "+ n);
     Area myObj2 = new Area(s,n);
     myObj2.returnArea(s, n);
     myScannerObj.close();
    }
    static int validatePositiveNumber(Scanner myObj){ // method definition
        int num;
        do{
            System.out.println("Enter positive Number:");
            while(!myObj.hasNextInt()){
                System.out.println("This is not a Number.Please enter positive Number:");
                myObj.next();
            }
            num = myObj.nextInt();
        }while(num <= 0);
      return num;
    } 
  }
