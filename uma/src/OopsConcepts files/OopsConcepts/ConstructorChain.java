package OopsConcepts;

public class ConstructorChain {
    int number;
    String subjects;
    boolean b;

   ConstructorChain(){    
        number=100;   // when parameters are not given variables must be assigned value
        subjects="physics";
        System.out.println("no parameters");
    }


    ConstructorChain(int n){
        this();
        number=n;
        System.out.println("one parameter");
    }

 
    ConstructorChain(int num , String sub){
        this(5);
        num=200;
        sub="math";
        System.out.println("int and string");
    }

    ConstructorChain(int i,int n){
     i=150;
     n=250;
        System.out.println("int and int");
    }

    ConstructorChain(String s,String t){
   this("uma",10,true);
        
        System.out.println("string and string");
    }

    ConstructorChain(String s,int n){
     this(150);
        System.out.println("string and int");
    }


    ConstructorChain(String s,int n,boolean b)
    {
        this(10 ,20);
       b=true;
        System.out.println("string,int and boolean");
    }

    public static void main(String[] args) {
      
        
       // constructor with no parameters
       ConstructorChain Obj = new  ConstructorChain();
       Obj.display();

       ConstructorChain Obj1 = new  ConstructorChain(2); // one parameter
       Obj1.display();

       ConstructorChain Obj2= new  ConstructorChain(3 ,"uma");
      Obj2.display();
    
       ConstructorChain Obj3= new  ConstructorChain("uma",4);
       Obj3.display();

       ConstructorChain Obj4 = new  ConstructorChain("uma","ram");
       Obj4.display();

       ConstructorChain Obj5 = new  ConstructorChain(5,1);
       Obj5.display();
        Obj5.display(20);

       ConstructorChain Obj6 = new  ConstructorChain("varsha",1,true);  //three parameters
       Obj6.display();

    }
       
    void display(){
        System.out.println("constructor chain");
    }
    private void display(int i){
        i=10;
    }

    

    
}

