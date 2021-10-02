package Assignment2;

public class Rectangle {
    public static void main(String[] args) {
        Rectangle rectangleObj = new Rectangle();
        int FirstRectangle = Rectanlge1(4, 5);
        System.out.println("Area of First Rectangle"+" "+FirstRectangle);
        int SecondRectangle = rectangleObj.Rectangle2(5, 8);
        System.out.println("Area of Second Rectangle"+" "+SecondRectangle);

    }

    static int Rectanlge1(int x, int y)
    {
        int z = x*y;
        return z;
    }
    int Rectangle2(int a, int b)
    {
        int c = a*b;
        return c;
    }
}
