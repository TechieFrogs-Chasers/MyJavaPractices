package Assignment2;

public class TriangleParameters {
    int a=3;
    int b=6;
    int c=2;
    public static void main(String[] args) {
     TriangleParameters triangleParameters = new TriangleParameters();
     int AreaResult= triangleParameters.Area(triangleParameters.a, 4);
     System.out.println("Area of Triangle"+" "+AreaResult);
     int PerimeterResult =triangleParameters.Perimeter(3, triangleParameters.b, 5);
     System.out.println("Perimeter of a Triangle"+" "+PerimeterResult);
     
    
    }

    public int Area(int x, int y)
    {
        int Area = (x*y)/2;
        return Area;
    }
    public int Perimeter(int x, int y, int z)
    {
        int Perimeter = x+y+z;
        return Perimeter;
    }
}
