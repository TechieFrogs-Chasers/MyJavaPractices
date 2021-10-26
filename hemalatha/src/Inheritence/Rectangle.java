package Inheritence;

public class Rectangle {
    int length,breadth;
   
    void area()
    {
        System.out.println("area of rectangle:"+(length*breadth));   // area = length * breadth; for rectangle

    }
    void perimeter()
    {
        System.out.println("perimeter of rectangle:"+(2*(length+breadth)));   // perimeter = 2*(length+breadth); for rectangle
    }
    Rectangle(int length,int breadth){   //constructor calling with two parameters
        this.length=length;
        this.breadth=breadth;
    }
}
    
    class Square extends Rectangle{
        int s;
        Square(int side){
        super(3,5);
        s=side;
        }
        void squarearea()
        {
            System.out.println("area of square:"+ (s*s));    // area = side * side; for square
        }
        void squareperimeter()
        {
            System.out.println("perimeter of square:"+(4*s));  // perimeter = 4*s; for square
        }

    
        public static void main(String[] args) {
            Rectangle rec = new Rectangle(4,5);
            Square sql = new Square(5);
            sql.squarearea();
            sql.squareperimeter();
            sql.area();
            rec.perimeter();

        }

    }


        


    

