import java.util.Scanner;
public class RectArea { 
    Scanner sc = new Scanner(System.in);
    int l = sc.nextInt();
    int b =sc.nextInt();
        public static void main(String[] args) {
            System.out.println("Enter the length of the rectangle:"); 
            
            System.out.println("Enter the breadth of the rectangle:"); 
            
        RectArea obj = new RectArea();
        obj.setDim(obj.l, obj.b); 
        int aa = obj.getArea();
        System.out.println(" the area is:" + aa);
    }
static void setDim(int l, int b){
    int len = l;
    int bre = b;
        System.out.println("the length & breadth: " + len + "&" + bre);        
}
public int getArea(){
    int area = l * b;
    return area;
}
}





