package Assignment2;

public class PerimeterOfTriangle {

    int a, b, c;

    public static void main(String[] args) {
        new PerimeterOfTriangle(3, 4, 5);
    }

    PerimeterOfTriangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;

        System.out.println("Area of traingle: " + a * b * c);
        System.out.println("Perimeter of a triangle: " + (a + b + c));
    }
}
