package OOPs;

//import java.lang.reflect.Constructor;

public class ConstructorChaining {
    int age =7;
    String name = "sindhu";
    float x = 2.33f;

    ConstructorChaining(){
        this(80);
        System.out.println("java");
    }
    ConstructorChaining(String s){
        this();
    name =s;
    System.out.println("1st chaining");
}
ConstructorChaining(String s,int n){
    this();
name =s;
age =n;
System.out.println("2nd chaining");
}
ConstructorChaining(int n){
    age = n;
    System.out.println("no this keyword");
}
void display(){
    System.out.println("chaining"+" "+  name+" "+age);
}

public static void main(String[] args) {
    ConstructorChaining t = new ConstructorChaining("sindhu",23);
    t.display();
    
}
}

    
