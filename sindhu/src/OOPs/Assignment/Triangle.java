package sindhu.src.OOPs.Assignment;
//4th problem
public class Triangle {
    int l;
    int b;
    int h;
    int a;
    
    void a(){
        int a = (b*h)/2;
        System.out.println(a);
      }
    
      void p(){
       int  p = (l+b+h);
        System.out.println(p);
      }

    void display()
    {
        System.out.println("thankyou");
    }
    
public static void main(String[] args) {
    Triangle v = new Triangle();
    v.display();
        Triangle x = new Triangle(3,4,5);
        x.display();
        x.a();
        x.p();
        }


Triangle(int length,int breadth,int height)
{
    l=length;
    b=breadth;
    h=height;
    System.out.println("first");

}

Triangle(){

}
}


// 3rd problem

/*public class Triangle {
    int l;
    int b;
    int h;

    void a(){
        int a = (b*h)/2;
        System.out.println(a);
      }
    
      void p(){
       int  p = (l+b+h);
        System.out.println(p);
      }

    
    public static void main(String[] args) {
        Triangle x = new Triangle();
        x.l =3;
        x.b=4;
        x.h=5;
        System.out.println(x.l);
        System.out.println(x.b);
        System.out.println(x.h);
        x.a();
        x.p();
    }

    Triangle(){
        System.out.println("default constructor");
    }


}*/





