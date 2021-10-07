package InheritanceExercise;
public class Rectangle {

    int length= 10;
    int breadth=15;


  

    Rectangle(int length,int breadth){

        int area=(this.length * this.breadth );
        System.out.println("area of the rectangle is  "+area);
        int perimeter=2*( this.length+this.breadth);
        System.out.println("perimeter of the rectangle is   "+perimeter);
    }
    
}
class Square extends Rectangle{
 int side=5;

    Square(int s ){
        super(10,15);
    }
    void area(int s){
        int area1 =( side * side);
        System.out.println("area of the square is  "+area1);
        int perimeter = 4*side;
        System.out.println("perimeter of the square is  "+perimeter);
    }


    public static void main(String[] args) {
        Square objSquare = new Square(10);
        objSquare.area(10);
    
    }

}
