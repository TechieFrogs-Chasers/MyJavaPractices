package Inheritance;

public class InheritanceDemo    // inheritance demo first class
 {
    int a ;
    int b ;
    int c ;
    void display(){
        System.out.println("First class Hi");
    }
    int addition(int x, int y)
    {
        int z = x+y;
        return z;
    }

     class MostInner
    {
        void most()
        {
            System.out.println("Most Inner");
        }
    }
        
}

class Nested  extends Inner2              // second class
 {
    String name = "Inheritance";
    int x = 20;
    void hello(){
        System.out.println("Second class No Output");
    }
    static int sub(int y, int z)
    {
        return z;
    }

 }

class Inner2 extends InheritanceDemo          // third class
{
    void hi()
    {
        System.out.println("Third class Inner");
    }
    static int sub(int y, int z)
    {
        return z;
    }


    public static void main(String[] args)
        {
            Inner2 inner2 = new Inner2();
            inner2.mostInner;
            
                        
        }
}
