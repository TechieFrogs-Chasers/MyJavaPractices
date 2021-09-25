package Assignment_1;

public class Triangle2 {
    int a,b,c;
    Triangle2()
    {
        this(3,4,5);
        System.out.println("enter the values:");
    }
    Triangle2(int a,int b,int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;

    }
    void display()
    {
       int area=a*b*c;
       int perimeter=a+b+c;
       System.out.println("area of triangle:"+area);
       System.out.println("perimeter of triangle:"+perimeter);

    }
    public static void main(String[] args) {
        Triangle2 tc = new Triangle2();
        tc.display();

    }
    
}
