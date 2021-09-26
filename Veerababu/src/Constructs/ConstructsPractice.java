package Constructs;

public class ConstructsPractice {

void veeru(){
    System.out.println("Constructors Concept");
}
    int a;
    int b;
    String s;
    public static void main(String[] args) {
        ConstructsPractice ConObj = new ConstructsPractice();
        ConObj.a = 10;
        ConObj.b = 15;
        ConObj.s = "Hi";
        ConObj.veeru();
        System.out.println(ConObj.a+" "+ConObj.b+" "+ConObj.s);
    }

}

class SubClass{
    int x;
    int y;
    public static void main(String[] args) {
        SubClass Sc = new SubClass();
        Sc.x =2;
        Sc.y =4;
        System.out.println("In Sub Class"+" "+Sc.x+"  "+Sc.y);
        ConstructsPractice ConObj1 = new ConstructsPractice();
        ConObj1.a = 5;
        ConObj1.b = 6;
        ConstructsPractice Cp = new ConstructsPractice();
        Cp.a = 12;
        Cp.b = 24;
        Cp.s = "Veeru";
        Chasers Ch = new Chasers();
        Ch.veeru();

        System.out.println("In Constructor class"+" "+(Cp.a+Cp.b+Sc.y+ConObj1.b));
    
    }
}
class Chasers{

    void veeru(){
        System.out.println("In Default Constructor");
    }
}
