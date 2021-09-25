public class TriangleCons {
    TriangleCons(int a, int b,int c){
    int Area = ((b*a)/2);
    int Perimeter= a+b+c;
    System.out.println("The area of the Triangle is: " + Area);
    System.out.println("The perimeter of the Triangle is: " + Perimeter );
    }
    public static void main(String[] args) {
        TriangleCons obj = new TriangleCons(3,4,5);
    }
}
