public class SquareAndRect {
    

    int area(int side){

        int area=side*side;
    System.out.println(area);
    return area;

    }

    int area(int length,int breadth){

        int area = length * breadth;
        System.out.println(area);
        return area;
    }
    public static void main(String[] args) {
        SquareAndRect obj = new SquareAndRect();
        obj.area(10);
        obj.area(10, 15);
    }
}
