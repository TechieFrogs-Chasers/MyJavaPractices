package assignment3;

public class Fourth {
    public static void main(String[] args) {
        Square obj= new Square(6);
        System.out.println("The area of the rectangle: "+ obj.Area());    
        System.out.println("The Perimeter of the rectangle: "+ obj.perimeter());  
        System.out.println("The area of the Square: "+ obj.areaSquare());    
        System.out.println("The Perimeter of the Square: "+ obj.periSquare());
    }    
}
class Rectangle{
    int length, breadth;
    Rectangle(int length, int breadth){
        this.length= length;
        this.breadth=breadth;
    }
    int Area(){
        int area = length*breadth;
        return area;
    }
    int perimeter(){
        int perimeter = 2 * (length+breadth);
        return perimeter;
    }
}
class Square extends Rectangle{
    int side;
    Square(int s){
        super(3,5);
        this.side = s;
    }
    int areaSquare(){
        int area= side*side;
        return area;
    }
    int periSquare(){
        int peri = 4*side;
        return peri;
    }
}
