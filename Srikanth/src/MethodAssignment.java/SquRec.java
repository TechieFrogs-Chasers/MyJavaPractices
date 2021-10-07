//package MethodAssignment;

public class SquRec {
    public void area(int s) {
        System.out.println("Area of square:" + (s * s));
    }

    public void area(int l, int r) {
        System.out.println("Area of rectangle is: " + (l * r));
    }

    public static void main(String[] args) {
        SquRec objRec = new SquRec();
        objRec.area(5, 7);
        objRec.area(5);
    }
}
