package Assignment_1;

public class Chaining {
    int age;
    String s;
    Chaining()
    { 
        this(5); 
        System.out.println("practice");
    }
    Chaining(int a)
    {
        this(6,5);
        System.out.println(a);
        System.out.println("Book details");
    }
    Chaining(int a,int b)
    {
        this(6,5,"hema");
        System.out.println(a*b);
    }
    Chaining(int a,int b,String s)
    {
        System.out.println(a*b  +s);
    }

    void display(){
        System.out.println("happy");
    } 
    
public static void main(String[] args) {
    Chaining ch = new Chaining();
    ch.display();
}
}




    

    




    
