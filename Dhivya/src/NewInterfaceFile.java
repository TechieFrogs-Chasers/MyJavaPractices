public interface NewInterfaceFile {
    int a =10;//implicitly public,static and final
    public static final int r =45; //explicitly mentioned.
    //protected int v =30;
    //private int b =20;//Illegal modifier for the interface field NewInterfaceFile.b; 
    //only public, static & final are permitted

    static void statMethod(){
        System.out.println("Hi, static method of interface");
    }
    public default void display(){
        System.out.println("In new interface default");
    }
    default void welcome(){
        System.out.println("in interface");
    }
    private void hello(){  // we can create but no use. bcz its not accessible anywhere outside.
        System.out.println("in private method");
    }
    //protected void protectmethod(); //Illegal modifier for the interface method protectmethod; 
    //only public, private, abstract, default, static and strictfp are permitted

    void hi();//abstract method
    public static void main(String[] args) {
        //hello();
        statMethod();
    }
    
}
class A implements NewInterfaceFile{
void statMethod(){
     NewInterfaceFile.statMethod(); // not able to use the super keyword  to access the staticmethod of the interface.       
        
    }
    public static void main(String[] args) {
        NewInterfaceFile obj = new A(); //dynamic binding is possible.
       // NewInterfaceFile obj1 = new NewInterfaceFile(); // can't instantiate the object.

        obj.display(); // this excutes the class method, if the class doesnot have then it goes to the interface mathod
        A newobj  = new A();
        newobj.statMethod();
        newobj.display();  
        newobj.welcome();
    }
    public void welcome(){
        NewInterfaceFile.super.welcome(); //able to acces the default overridden method of the interface class
        System.out.println("in class");
    }
    @Override
    public void hi() {
        // TODO Auto-generated method stub
        
    }
    public  void display(){
        System.out.println("In class display method");
    }

}