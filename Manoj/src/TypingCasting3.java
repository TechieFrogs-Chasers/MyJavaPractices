class Parent{
    void Show (){
        System.out.println("parent class show method ");
    }
    void Display(){
        System.out.println("parent class display method");
    }
}
class Child extends Parent{
    void Show(){
       System.out.println("child class show method ");
    }
    void print(){
        System.out.println("child class print method ");
    }
}
//upcasting is  converting subclass into superclass or child is converted to parent class


public class TypingCasting3 {
    public static void main(String[] args) {
        
   // Child c=new Child();    
    Parent p=new Child();
  //  Child c=new Parent(); we cannot convert parent to class
      

    //in upcasting we are able to call the same  method which is present in the sub class 
    p.Show();
    p.Display();
  //  p.print();    //we can't able to call child class method with parent reference 
    ((Child)p).print(); //by providing paranthesis we can call the method.by downcasting

    }
    
}
