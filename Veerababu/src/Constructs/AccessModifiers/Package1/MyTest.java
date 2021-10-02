package Constructs.AccessModifiers.Package1;

public class MyTest {
    int a;
    int b;
    public static void main(String[] args)
    {
        MyTest myTest = new MyTest(4, 5);
        System.out.println("a and b"+" "+(myTest.a+myTest.b));
        int result = myTest.myTest();
        System.out.println("Output"+" "+result);
        
    }

    protected MyTest(int x, int y)
    {
        a = x;
        b = y;
    }
    int myTest()
    {
        int a=10;
        int b=15;
        int c=a+b;
        return c;
    }
}
