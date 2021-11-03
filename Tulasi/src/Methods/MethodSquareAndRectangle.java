package Methods;//Package

public class MethodSquareAndRectangle {//Driver Class

    void AreaRectangle(float length, float breadth) {//Method
        System.out.println("Enter length " + length + "Enter breadth " + breadth + "= " + (length * breadth));
    }

    void AreaRectangle(float sideofsquare) {//Method
        System.out.println("Enter sideofsquare =" + (sideofsquare * sideofsquare));
    }

    public static void main(String[] args) {//Main method
        MethodSquareAndRectangle myMethodObj = new MethodSquareAndRectangle();//Instance for driver class
        myMethodObj.AreaRectangle((float) 1.2, (float) 2.1);//Call method with two parameters
        myMethodObj.AreaRectangle((float) 1.4);//call method with one parameter

    }
}
