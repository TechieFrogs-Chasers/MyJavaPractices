public class NewClass implements NewInterfaceFile,OldInterface{
    public static void main(String[] args) {
        NewClass obj = new NewClass();
        obj.display();
        ClassInsideInterface obj2 = new ClassInsideInterface(); //to access the class inside an interface, 
           //create object for the class. 
        obj2.normalMethod();
        
    }
    public void display(){
        OldInterface.super.display();
        NewInterfaceFile.super.display();
        System.out.println(" INSIDE CLASS METHOD");
    }
    


}
