public class A {
    static  void prints(){
        System.out.println("parent");
    }
    
}
class B extends A{

    static void prints(){
        System.out.println("child");
    }

   /* public static void main(String[] args) {
        B objB = new B();
        objB.prints();   // calls child

        B.prints();

        A objA = new A();
        objA.prints();    //calls parent

        A obj = new B();
        obj.prints();   //calls  parent

    }*/
}
