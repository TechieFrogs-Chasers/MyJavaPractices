import java.util.Scanner;
public class ConsLoad {
    public static void main(String[] args) {
        OverLoad obj = new OverLoad();
        OverLoad obj1 = new OverLoad("krishna", 45);
        OverLoad obj2= new OverLoad(22,"silver cir, lincoln, NE");
        OverLoad obj3 = new OverLoad(6, 75);  
        Test obj4 = new Test();
        //System.out.println("the value of c is: "+ c);
    } 
}
class OverLoad
{
    OverLoad()
    {
        System.out.println("In default constructor");
    }
    OverLoad(String name, int a)
    {
        System.out.println("The name and age of " + name +" is "+ a)  ;
    }
    OverLoad(int a, int b)
    {
        System.out.println("The height is " + a + " FT & weight is " + b + " kg");
    }
    OverLoad(int a, String name)
    {
        System.out.println(" The address : "+ a +"," + name);
    }  
}
class Test
{
   static int a,b,c;
    Test()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value for A and B: ");
        a=input.nextInt();
        b=input.nextInt();
        
         c = a*b;
        System.out.println("the value of c is : "+ c);

    }
    
}