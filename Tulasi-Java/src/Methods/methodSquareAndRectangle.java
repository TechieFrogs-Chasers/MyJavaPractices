package Methods;//Package

public class methodSquareAndRectangle {//Driver Class

    void AreaRectangle(float length, float breadth) {//Method
        System.out.println("Enter length " + length + "Enter breadth " + breadth + "= " + (length * breadth));
    }

    void AreaRectangle(float sideofsquare) {//Method
        System.out.println("Enter sideofsquare =" + (sideofsquare * sideofsquare));
    }

    public static void main(String[] args) {//Main method
        methodSquareAndRectangle myMethodObj = new methodSquareAndRectangle();
        myMethodObj.AreaRectangle((float) 1.2, (float) 2.1);
        myMethodObj.AreaRectangle((float) 1.4);

    }
}
