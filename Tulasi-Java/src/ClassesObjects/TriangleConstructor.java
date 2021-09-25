package ClassesObjects;


public class TriangleConstructor {//Driver class
    int i, j, k;

    public static void main(String[] args) {//main method
        new TriangleConstructor(3, 4, 5);//instance for TriangleConstructor
    }

    TriangleConstructor(int a, int b, int c) {//Constructor
        i = a;
        j = b;
        k = c;

        System.out.println("Area of traingle is :" + a * b * c);
        System.out.println("Perimeter of traingle is :" + (a + b + c));

    }
}

