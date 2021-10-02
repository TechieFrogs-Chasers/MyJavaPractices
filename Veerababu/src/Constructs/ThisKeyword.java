package Constructs;

public class ThisKeyword {
    int x=10;
    int y=12;
    String name;
    public static void main(String[] args) {
        ThisKeyword thisKeyword = new ThisKeyword();
        System.out.println("Default"+" "+thisKeyword.x);

        ThisKeyword thisKeyword1 = new ThisKeyword(100);
        System.out.println("First"+thisKeyword1.x+" "+thisKeyword1.name+" "+thisKeyword1.y);

        ThisKeyword thisKeyword2 = new ThisKeyword(100,20,"hi");
        System.out.println("Second"+" "+thisKeyword2.x);
        
        ThisKeyword thisKeyword3 = new ThisKeyword(100,20);
        System.out.println("Third"+" "+thisKeyword3.x+" "+thisKeyword3.y);

        ThisKeyword thisKeyword4 = new ThisKeyword("hello");
        System.out.println("Third"+" "+thisKeyword4.name);


    }
    ThisKeyword()
    {
        this("s");
        System.out.println("Default Constructor");
    }
    ThisKeyword(int a, int b)
    {
        this(50); 
        x=a;
        y=b;
        System.out.println("In First Parametric Constructor");
    }
    ThisKeyword(int a, int b, String FullName)
    {
        x=a;
        y=b;
        name=FullName;
        System.out.println("In Second Parametric Constructor");
    }
    ThisKeyword(int a)
    {
        x=a;
        System.out.println("Single Constructor");
    }
    ThisKeyword(String s)
    {
        this(20,22,"FullName");
        name=s;
        System.out.println("String Constructor");
    }
}
