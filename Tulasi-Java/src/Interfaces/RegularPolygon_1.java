package Interfaces;

interface RegularPolygon {
    abstract int getNumSides();
    abstract int getSideLength();
    default void getPerimeter(int n,float length){
        System.out.println("Perimeter: " + n*length);
    }
    default void getInteriorAngle(int n,float radians){
        System.out.println("Interior Angle: "+ ((n-2)*(Math.PI)/radians)*2);//double area = (nSides * Math.pow(sLength, 2))/ (4 * Math.tan ((Math.PI) / nSides));
    }
}
class EquilateralTriangle implements RegularPolygon{
    int length;
    EquilateralTriangle(){
        length=9;
    }

    @Override
    public int getNumSides() {
        return 3;
    }

    @Override
    public int getSideLength() {
         return length;
    }
}
class Square implements RegularPolygon{
    int length=11;

    @Override
    public int getNumSides() {
        return 4;
    }

    @Override
    public int getSideLength() {
        return length;
    }
}
public class RegularPolygon_1{
    public static void main(String[] args) {
        EquilateralTriangle constructorObj1=new EquilateralTriangle();
        System.out.println(constructorObj1.getNumSides());
        System.out.println(constructorObj1.getSideLength());
        constructorObj1.getPerimeter(9,5);
        constructorObj1.getInteriorAngle(8,6);

        Square constructorObj2=new Square();
        System.out.println(constructorObj2.getNumSides());
        System.out.println(constructorObj2.getSideLength());
        constructorObj2.getPerimeter(9,9);
        constructorObj2.getInteriorAngle(6,6);
    }
}