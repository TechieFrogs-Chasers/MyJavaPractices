package sindhu.src.InheritanceAssignment;

public class Rectangle {
    int length;
    int breadth;

    void area(int length , int breadth){
      int  area = length *breadth;
      System.out.println("area of rectangle" + area);
    }
    void perimeter(int length , int breadth){
        int perimeter = 2*(length*breadth);
        System.out.println("perimeter of rectangle" + perimeter);
    } 

    public static void main(String[] args) {
        Rectangle x = new Rectangle(5,6);
        x.area(5,6);
       x.perimeter(5,6);
 }

    Rectangle(int length, int breadth)
    {
        int  area = length *breadth;
      System.out.println("area of rectangle" + area);
      int perimeter = 2*(length+breadth);
        System.out.println("perimeter of rectangle" + perimeter);
        
        System.out.println("constructor");
        
    }
}
class Square extends Rectangle{
    Square(int s) 
    {
        super(3, 4);
    }
    void area1(int s)
    {
        int area1 = s*s;
        System.out.println("area of a square" + area1);
    }
public static void main(String[] args) 
{
    Square y = new Square(3);
     y.area1(3);
}

}
