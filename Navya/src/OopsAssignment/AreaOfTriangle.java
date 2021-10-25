package OopsAssignment;

public class AreaOfTriangle {
    int a = 3;
    int b = 4;
    int c = 5;
    public static void main(String[] args) {
        AreaOfTriangle myObj = new AreaOfTriangle();
        AreaOfTriangle myObj1 = new AreaOfTriangle(3,4,5);
    }
    AreaOfTriangle(){ // without parameters
        System.out.println("Area Of Triangle = "+ (a*b)/2);
        System.out.println(" Perimeter Of Triangle = "+ (a+b+c));
    }
        AreaOfTriangle(int i, int j, int k){// with parameters
            i = a;
            j = b;
            k = c;
            System.out.println("Area Of Triangle =" +(a*b)/2);
            System.out.println("Perimeter Of Triangle = "+(a+b+c));
        }

}
