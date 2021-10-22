package InterfaceAssignment;

public class Concrete extends HomeAnimals{
    public static void main(String[] args) {
        Concrete obj = new Concrete();//using class object to access the interace methods.
        obj.second(obj);
        HomeAnimals newobj = new HomeAnimals();
        newobj.third(obj);
        newobj.sleep();
        Cat c1 =newobj.second(obj);// using cat instance to fetch the value;
        c1.eat();
        c1.sleep();
        //type casting
    }
}
interface Dog{
    void run();
    void walk();
}
interface Cat{
    void sleep();
    void eat();
}
interface Fox{
    void bark();
    void watch();
}
interface Animal extends Dog,Cat,Fox{ 
    void greet();
}
class HomeAnimals implements Animal{
    Dog d;
    @Override
    public void run() {
        System.out.println("Running");    
    }
    @Override
    public void walk() {
        System.out.println("Walking");
    }
    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
    @Override
    public void eat() {
        System.out.println("Eating");
    }
    @Override
    public void bark() {
        System.out.println("Barking");
    }
    @Override
    public void watch() {
        System.out.println("Watching");
    }
    @Override
    public void greet() {
        System.out.println("Greeting");   
    }
      void first(Dog d){
        System.out.println("In dog interface");
        
    }
   Cat second(Cat c){
        System.out.println("In cat interface");
        return c;
    }
    void third(Fox f){
        System.out.println("In fox interface");
    }
}
