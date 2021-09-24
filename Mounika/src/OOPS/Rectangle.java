package OOPS;

public class Rectangle {
    int length;
    int breadth;
    int area;
    Rectangle(int l, int b){
        length = l;
        breadth = b;
    }
    public static void main(String[] args) {
        Rectangle obj = new Rectangle(4, 5);
        Rectangle obj1 = new Rectangle(5, 8);
        System.out.println("Area of 1st Triangle : "+obj.Area());
        System.out.println("Area of 1st Triangle : "+obj1.Area());
    }
    public int Area(){
        return length*breadth;

    }
}