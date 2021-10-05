package OopsPractices.InheritanceAssignment;

 class Rectangle{
     int length;
     int breadth;
     void area(){
         int Area = length *breadth;
         System.out.println("Area of the rectangle is : "+Area);
     }
     void Perimeter(){
         int perimeter = (length+breadth)*2;
         System.out.println("Perimeter of the rectangle is : "+perimeter);
     }
     Rectangle(int i,int b){
         this.length = i;
         this.breadth = b;
     }
 }
 class Square extends Rectangle{
     int side ;
    Square(int s){
        super(4,7);
        this.side = s;
    }
    void AreaOfSquare(){
        int area = side*side;
        System.out.println("Area of the Square is : "+area );
    }
 }
public class RectangleSquare {
    public static void main(String[] args) {
        Square squareObj = new Square(6);
        squareObj.area();
        squareObj.Perimeter();
        squareObj.AreaOfSquare();
    }
}
