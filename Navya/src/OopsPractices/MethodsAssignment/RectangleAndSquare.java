package OopsPractices.MethodsAssignment;

public class RectangleAndSquare {
    public int areaOfRectangle( int l , int b){
        int rec = l*b;
        System.out.println("Area of rectangle is "+rec);
        return rec;
    }
    public int AreaOfSquare(int s){
        int sqr = s*s;
        System.out.println("Area of square is "+ sqr);
        return sqr;
    }
    public static void main(String[] args) {
        RectangleAndSquare obj = new RectangleAndSquare();
        obj.areaOfRectangle(4,6);
        obj.AreaOfSquare(4);
    }
}
