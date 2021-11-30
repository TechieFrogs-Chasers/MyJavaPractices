package Assignment4;
interface RegularPolygon{
    int a=3;
    int b=4;
    int c=5;
    int n=3,length=4;
    abstract  int  getNumSide();
    abstract int  getSideLength();
    static int  TotalSlides(){
      int   sum =a+b+c;
      //System.out.println("sum of the no of the sides are: "+sum);
      return sum  ;
    }
    default void getperimeter(){
       int  perimeter=n*length;
       System.out.println("perimeter of the length : "+perimeter);

    }
    default void getInteriorAngle(){
        int angle =(n-2)*n/n;
        System.out.println("interior angle : "+angle);
    }

}
class EquilateralTriangle implements RegularPolygon{
    int i=6;
    public int  getNumSide(){
     //   System.out.println();
        return 3;

    }
    public int  getSideLength(){
        System.out.println(i);
        return i;

    }
        EquilateralTriangle(int e){
         int i=e;
         System.out.println("constructor in tri :"+e);
        }
}

class Square implements RegularPolygon{
    int j=5;
    public int  getNumSide(){ 
        return 4;   
    }
    public int  getSideLength(){
        System.out.println(j);
        return j;    
    }
    Square(int s){
      int j=s;
      System.out.println("constructor in square :"+s);
    }
}

public class Poly {
    public static void main(String[] args) {
        EquilateralTriangle obj=new EquilateralTriangle(9);
        System.out.println (obj.getNumSide());
        obj.getSideLength();
        Square obj2=new Square(45);
        obj2.getNumSide();
        obj2.getSideLength();
        RegularPolygon.TotalSlides();
        obj.getperimeter();
        obj.getInteriorAngle();
        
    }
    
}
