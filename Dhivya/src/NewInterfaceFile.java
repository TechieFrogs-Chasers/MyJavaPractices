public interface NewInterfaceFile {
    static void statMethod(){
        System.out.println("Hi, static method of interface");
    }
    default void display(){
        System.out.println("In new interface default");
    }
    private void hello(){  // we can create but no use. bcz its not accessible anywhere outside.
        System.out.println("in private method");
    }
}
class A implements NewInterfaceFile{
void statMethod(){
     NewInterfaceFile.statMethod(); // not able to use the super keyword  to access the staticmethod of the interface.       
        
    }
    public static void main(String[] args) {
        A newobj  = new A();
        newobj.statMethod();
        newobj.display();
        
    }

}