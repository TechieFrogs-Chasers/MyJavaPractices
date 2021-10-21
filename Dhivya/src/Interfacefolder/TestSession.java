package Interfacefolder;
// This pgm is about how to use object of the class as return type ?
public class TestSession {
    int x;
    TestSession(int x){
        this.x=x;
    }
   public TestSession updateObject(){
        TestSession obj = new TestSession(x+20);
        return obj;    
    }
}
class MyClass{
    public static void main(String[] args) {
        TestSession newobj = new TestSession(30);
        System.out.println("The value of object before updation: " + newobj.x);
        newobj = newobj.updateObject();
        System.out.println("The value of object after updation: " + newobj.x);
    }
}