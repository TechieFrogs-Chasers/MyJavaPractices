package sindhu.src;

//import Assignment_1.Main;

/*public class NestedClass {

    int i;
    String name;

    void display(){
        System.out.println("sindhu");
    }

    public class InnerClass{
        int k=9;
        void InnerDisplay(){
            System.out.println("default constructor" + " " + name);
        }

        class InnerClass1{
            int i=5;
        }
    }
     public static void main(String[] args) {
        NestedClass x = new NestedClass();  //outer class instance creation
        NestedClass.InnerClass y = x.new InnerClass();   //inner class instance creation
        NestedClass.InnerClass.InnerClass1 z = y.new InnerClass1(); //innerclass1 instance creation
        y.InnerDisplay();
       System.out.println(y.k);
       x.display();
       System.out.println(x.i);
       System.out.println(x.name);
       System.out.println(z.i);
    }
    
    
}*/


/*public class NestedClass{
    String name ;
    int id;
    int age;

    class College{

        void display(){

            System.out.println("JNTU");
        }

        College(){
           // this(4);
            System.out.println("first constructor");
        }

       /*NestedClass(){
            System.out.println("default constructor");
        }
    

    class Student{
            //Student(int a)
           Student() {
                System.out.println("2nd constructor");
            }
            String name = "sindhu";
            int age =28;
            int id = 345;

        }



    }

    public static void main(String[] args) 
    {
        NestedClass x = new NestedClass();
        NestedClass.College y = x.new College();
        NestedClass.College.Student z = y.new Student();
        y.display();
        System.out.println(x.name);
        System.out.println(z.id);
        System.out.println(z.age);
        
    }

    
}*/


public class NestedClass
{
    int i=4;
    String name;
    void display()
    {
        System.out.println("method");
        InnerMost b = new InnerMost(); // in non-static we can directlt create inner class instance
        System.out.println(b.d);
        //InnerMost.k;
        b.NestedClass();

        
         NestedClass.InnerMost.InnerOne h = b.new InnerOne();
        System.out.println(h.j);
            
    }
    
private class InnerMost
    {
       static  int k; 
        int d=8;  

        void NestedClass()
        {
            System.out.println("Top Class Method");
        }
        
class InnerOne
    {
         int j;

         





        InnerOne()
           
        {
            System.out.println("constructor" + " "+ k); // bcz we have given as constant(i.e; static and final), so we gonna access k
        }
        
    }
}
public static void main(String[] args) 
{
    NestedClass x = new NestedClass();
    NestedClass.InnerMost y = x.new InnerMost();
    NestedClass.InnerMost.InnerOne z = y.new InnerOne();
    System.out.println(x.i);
    y.NestedClass();
    System.out.println(z.j);
    x.display();

}

}





