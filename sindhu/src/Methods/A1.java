package sindhu.src.Methods;

public class A1 {

    static void hi(){
        System.out.println("Parent");
    }
    
}

class B1 extends A1{
    static void hi(){
        System.out.println("child");
    }

    public static void main(String[] args) {
        B1 x = new B1();
        B1.hi();
        A1 obj = new B1();
            A1.hi();
            
        

}
}