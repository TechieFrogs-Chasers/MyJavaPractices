package sindhu.src;

/*public class NestedClasses {

    static int x =10;

    int y =20;

    private int z =30;

    class InnerClass{
        void display(){
            System.out.println("method");
            System.out.println(x);

        }

}
}

class Demo{

        public static void main(String[] args) {
            
        NestedClasses run = new NestedClasses();

        NestedClasses.InnerClass innerObj = run.new InnerClass();
        innerObj.display();

        

    }
}*/

/*public class NestedClasses{
    int i;                       // here nestedclass = outer class
    String name;

    void display(){
        System.out.println("method");
    }

    NestedClasses(){
        System.out.println("constructor");
    }

    NestedClasses(int j, int k){
        System.out.println("two parameterised constructor");
    }

    static int j =10;

    class Inner{
        void display(){
            System.out.println("method1");  //over ride
        }

         Inner(int i){
             System.out.println("parameterised constructor");
         }
class inner1{
    int id =50;
    int age =25;

    inner1(){
        System.out.println("constructor for this class");
    }

    inner1(int y){
        this();
        System.out.println("parameterised constructor");
    }

    inner1(int r, int e){
        this();
        System.out.println("two parameterised constructor");
    }
}
        
    }

 
}
class Demo{
    public static void main(String[] args) {
        NestedClasses x = new NestedClasses(4,5);

        NestedClasses.Inner z = x.new Inner(5);

        NestedClasses.Inner.inner1  y = z.new inner1(2,3);

        System.out.println(y.id);

        z.display();
    }
}*/


public class NestedClasses{
    static int i=8;
    float j = 2.33f;
    byte k = 4;
    short s =6;

    long t =4L;
    double h = 2.8d;

static void hi(){
    System.out.println("method");
}



NestedClasses(){
    System.out.println("constructor");
}




static class staticSubClass{



    


   staticSubClass(){
        
        System.out.println("subclass constructor");
    }

    void display(){
        System.out.println("subclass method");
    }

    



    
}
}

class Demo1{

    public static void main(String[] args) {

        NestedClasses y = new NestedClasses();
        System.out.println(y.k);

        



        
    
    NestedClasses.staticSubClass x = new NestedClasses.staticSubClass();
    x.display();

    NestedClasses.hi();
    
    
    
    
    
}
}




    

