package Assignment2;

public class Triangle {
    public static void main(String[] args)
 {
        Triangle triangleObj = new Triangle();
        int AreaResult =triangleObj.Area();
        System.out.println("Area of Triagnle in Static Method"+" "+AreaResult);
        float PerimeterResult = triangleObj.Permiter();
        System.out.println("Permiter of a Trianlge in Static method"+" "+PerimeterResult);


    }

    int Area()
    {
        int a = 3;
        int b = 4;
        int area = (b*a)/2;
        return area;
    }

    float Permiter()
    {
        int a = 3;
        int b = 4;
        int c = 5;
        int d = a+b+c;
        return d;
    }

}
