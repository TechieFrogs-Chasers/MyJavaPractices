package method;

public class AreaFind {
    public static void main(String[] args) {
        System.out.println("The area of Rectangle: "+ Area(3, 5));
        System.out.println("The area of sqaure: "+ Area(10));
        
    }
    static int Area(int l, int b){
        int area = l*b;
        return area;
    }
    static int Area(int s){
        int area = s*s;
        return area;
    }
}
