package InterfaceAssignment;
interface RegularPolygon{
   int getNumSides();
   int getSideLength();

   static int totalSides(){
       return 7; // number sides of all elements
   }
   default void  getPerimeter(int n,int length){
       System.out.println("Perimeter = "+ n* length);
   }
   default void getInteriorAngle(int n , int radius){
       float pi = 22/7f;
       System.out.println(pi);
       System.out.println("Interior angle = "+ (n-2)* pi/n);
   }
}
class EquilateralTriangle implements RegularPolygon{

    int length;
    public int getNumSides() {

        return 3;
    }
    EquilateralTriangle(){
        length = 5;
    }
    public int getSideLength() {

        return length;
    }

}
public class Square implements RegularPolygon{
    int length ;
    public int getNumSides() {
        return 4;
    }

    Square(){
        length = 6;        
    }
    public int getSideLength() {
        return length;
    }
    public static void main(String[] args) {
        EquilateralTriangle triObj = new EquilateralTriangle();
        triObj.getPerimeter(4,6);
        triObj.getInteriorAngle(5,7);
        System.out.println(triObj.getNumSides()+" "+triObj.getSideLength());
        Square sqrObj = new Square();
        System.out.println(sqrObj.getNumSides()+ " "+ sqrObj.getSideLength());
    }
}
