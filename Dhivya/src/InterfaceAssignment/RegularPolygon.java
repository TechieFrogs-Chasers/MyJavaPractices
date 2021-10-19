package InterfaceAssignment;
public interface RegularPolygon {
    abstract int getNumSides();
    abstract int getSideLength();
    default int getPerimeter(int n,int length){
        int perimeter = n*length;
        return perimeter;
    }
    default int getInteriorAngle(int n){
        int angle = 180/n;
        return angle;
    }
    static void totalSides(int polygon[]){
        int sum =0;
        for(int i =0;i<polygon.length;i++){
         sum+=polygon[i];
        }
        System.out.println("The total no of sides of square and equilateral triangle: " +sum);
    }
}
class EquilateralTriangle implements RegularPolygon{ 
   int s;
    EquilateralTriangle(int s){
  this.s=s;
    }
    @Override
    public int getNumSides() {
       return 3;
    }
    @Override
    public int getSideLength() { 
        return s;  
    }
}
class Square implements RegularPolygon{
    int s;
    Square (int s){
        this.s=s;
    }
    @Override
    public int getNumSides() {  
        return 4;
    }
    @Override
    public int getSideLength() { 
        return s;
    }   
}
class Test{

    public static void main(String[] args) {
        EquilateralTriangle obj = new EquilateralTriangle(5); //obj for traingle class
        System.out.println("The number of sides for a triangle: "+obj.getNumSides());
        System.out.println("The length of a triangle: "+obj.getSideLength());
        System.out.println("The Interior angle of Equilateral triangle: " + obj.getInteriorAngle(obj.getNumSides()));
        System.out.println("the perimeter of Triangle is :"+ obj.getPerimeter(obj.getNumSides(), obj.getSideLength()));
        
        Square obj2 = new Square(6); //obj for square class
        System.out.println("The number of sides for a square : "+obj2.getNumSides());
        System.out.println("The length of a square : "+obj2.getSideLength());
        System.out.println("the perimeter of square is :"+ obj2.getPerimeter(4, 5));
        System.out.println("The Interior angle of Square " + obj2.getInteriorAngle(obj2.getNumSides()));
        
       int[] polygon = {obj.getNumSides(),obj2.getNumSides()};
       RegularPolygon.totalSides(polygon); //calling static method of interface by passing array as parameter.
        
    }
}
/* 1.this program is about creating interface with 2 abstract methods,
two default methods, one static methods.
2.two classes names triangle, square are implementing the interface,
3.we are able to access the default method and static method by passing the classes instance 
variables as parameters.
4.we are also using array as a parameter for the static class.
*/