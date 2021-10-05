package sindhu.src.InheritanceAssignment;

public class A {
    int i;
    int j;

    void show(){
        System.out.println("method");
    }
    A(){
        System.out.println("constructor");
    }

class B extends A{
    int k;
    B(){
        System.out.println("constructor");
    }

    void show(5){
        System.out.println("method");

    }

    public static void main(String[] args) {
        B  x = new B();
        x.show();
       

    }

}

    
}
