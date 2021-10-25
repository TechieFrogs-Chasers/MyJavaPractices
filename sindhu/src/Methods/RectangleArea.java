package sindhu.src.Methods;

public class RectangleArea {
    int length;
    int breadth;
    int square;
    
    void hi(int a , int b){
        length = a;
        breadth = b;
       

        int area = a*b;
        System.out.println("area of rectangle =" + area);
    }

RectangleArea(int i){
    System.out.println("constructor1");
}

       
        



void hi(int c){
    this.square = c;
    
    int area = c*c;
    System.out.println("area of a square = "+area);
}

public static void main(String[] args) {
    RectangleArea x = new RectangleArea();
    x.hi(4);
    x.hi(2,3);
}

RectangleArea(){
    this(3);
    System.out.println("constructor");
}
    
}
