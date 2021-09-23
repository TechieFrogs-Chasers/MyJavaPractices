package Assignment2;

public class Triangle {
    int a,b,c;
    public static void main(String...args){
        Triangle obj=new Triangle();      //object has created 
        Triangle obj2=new Triangle(3,4,5);
    }
    Triangle(){ //without parameters 
        a=3;
        b=4;
        c=5;
        System.out.println("perimeter of triangle is");
        System.out.println(a+b+c);
        System.out.println("area of triangle is");
        System.out.println((a*b)/2);
    }
    Triangle(int i,int j,int k){ //with parameters 
      a=i;
      b=j;
      c=k;
      System.out.println("perimeter of triangle is ");
      System.out.println(a+b+c);
      System.out.println("area of traingle is ");
      System.out.println((a*b)/2);
    }
    
}
