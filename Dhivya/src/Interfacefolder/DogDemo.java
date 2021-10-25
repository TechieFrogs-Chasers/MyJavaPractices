package Interfacefolder;

public class DogDemo {
    public static void main(String[] args) {
        Dog d = new Dog("tommy", 4);
    d.printdog(d);
    }   

    
}
class Dog{
    String name;
    int age;
    Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void printdog(Dog dog){
        System.out.println("The name of the dog: "+ name+", age is : "+ age);
    }

}