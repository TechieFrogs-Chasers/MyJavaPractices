public class OopsConcept {
    int a;
    int b;
    public static void main(String[] args)
     {
        OopsConcept Oops = new OopsConcept();
        Oops.a=10;
        Oops.b=20;
        System.out.println("Print Sum of a and b"+" "+ (Oops.a+Oops.b));
    }
}

class SubClass{
    int x;
    static int y;
        public static void main(String[] args) 
        {
           SubClass Oops1 = new SubClass();
           Oops1.x=15;
           SubClass.y=25;
           OopsConcept Oops = new OopsConcept();
           Oops.a=5;
           Oops.b=4;
           OopsConcept Oops2 = new OopsConcept();
           Oops2.a=5;
           Oops2.b=4;
           SubClass.y=50;

        System.out.println("Oops and Subclass "+" "+(Oops1.x+SubClass.y)+" "+"and"+" "+(Oops.b+Oops2.b));
        }  

    }

    
