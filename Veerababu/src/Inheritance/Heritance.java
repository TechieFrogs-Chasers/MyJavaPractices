package Inheritance;



public class Heritance
 {
        int x = 10;
        int y = 15;
        void Add()
        {
            System.out.println("Addition  "+(x+y));
            class InnerOne
            {
                int l = 10;
                int m = 10;
                void display()
                {
                    System.out.println("Display Method"+" "+(l+m));
                }
            }
            InnerOne innerOne = new InnerOne();
            innerOne.display();;
            
        }
 }

class Subtration extends Heritance
{
    void sub()
    {
        System.out.println("Subtraction  "+(x+y));
        
    }
}

class Multiplication extends Subtration
{
    void Mul(){
        System.out.println("Multilication  "+(x+y));
    }
}
class Division extends Multiplication
{
    void Div()
    {
        System.out.println("Division "+" "+(x+y));
    }

 

        public static void main(String[] args)
         {
            Division division = new Division();
            division.Add();
            division.sub();
            division.Mul();
            division.Div();
        }
}


